import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiviteTacheComponent } from './activite-tache.component';

describe('ActiviteTacheComponent', () => {
  let component: ActiviteTacheComponent;
  let fixture: ComponentFixture<ActiviteTacheComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActiviteTacheComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiviteTacheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
