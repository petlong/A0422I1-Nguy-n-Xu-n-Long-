import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceEidtComponent } from './service-eidt.component';

describe('ServiceEidtComponent', () => {
  let component: ServiceEidtComponent;
  let fixture: ComponentFixture<ServiceEidtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServiceEidtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServiceEidtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
