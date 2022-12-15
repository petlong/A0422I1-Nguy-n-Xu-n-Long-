package codegym.repository;

import codegym.bean.Song;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class SongRepositoryImpl implements ISongRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Song> findAll() {
            return entityManager.createQuery ("select s from song s").getResultList();
    }

    @Override
    public void save(Song song) {
        entityManager.persist(song);

    }

    @Override
    public void update(Song song) {
        entityManager.merge(song);
    }


    @Override
    public void remove(String name) {
        Song s = findOfName(name);
        entityManager.remove(s);
    }

    @Override
    public Song findOfName(String name) {
        return entityManager.find(Song.class, name);
    }
}
