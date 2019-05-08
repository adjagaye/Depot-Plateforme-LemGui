import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiviteCibleComponent } from './activite-cible.component';

describe('ActiviteCibleComponent', () => {
  let component: ActiviteCibleComponent;
  let fixture: ComponentFixture<ActiviteCibleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActiviteCibleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiviteCibleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
