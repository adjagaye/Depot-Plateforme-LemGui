import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiviteIndicateurComponent } from './activite-indicateur.component';

describe('ActiviteIndicateurComponent', () => {
  let component: ActiviteIndicateurComponent;
  let fixture: ComponentFixture<ActiviteIndicateurComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActiviteIndicateurComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiviteIndicateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
