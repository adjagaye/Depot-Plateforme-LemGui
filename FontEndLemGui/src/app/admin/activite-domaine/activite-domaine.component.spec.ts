import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiviteDomaineComponent } from './activite-domaine.component';

describe('ActiviteDomaineComponent', () => {
  let component: ActiviteDomaineComponent;
  let fixture: ComponentFixture<ActiviteDomaineComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActiviteDomaineComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiviteDomaineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
