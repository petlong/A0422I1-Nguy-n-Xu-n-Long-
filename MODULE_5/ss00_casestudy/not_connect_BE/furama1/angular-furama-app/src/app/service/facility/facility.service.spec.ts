import { TestBed } from '@angular/core/testing';

import { FacilityService } from 'src/app/service/facility/facility.service';

describe('FacilityService', () => {
  let service: FacilityService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FacilityService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
