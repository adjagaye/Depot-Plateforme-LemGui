import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiviteCommissionComponent } from './activite-commission.component';

describe('ActiviteCommissionComponent', () => {
  let component: ActiviteCommissionComponent;
  let fixture: ComponentFixture<ActiviteCommissionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActiviteCommissionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiviteCommissionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
