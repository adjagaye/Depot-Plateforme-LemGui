import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsProgrammeComponent } from './details-programme.component';

describe('DetailsProgrammeComponent', () => {
  let component: DetailsProgrammeComponent;
  let fixture: ComponentFixture<DetailsProgrammeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailsProgrammeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsProgrammeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
