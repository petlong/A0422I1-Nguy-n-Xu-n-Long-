import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdcutDeleteComponent } from './prodcut-delete.component';

describe('ProdcutDeleteComponent', () => {
  let component: ProdcutDeleteComponent;
  let fixture: ComponentFixture<ProdcutDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProdcutDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProdcutDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
