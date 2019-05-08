import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MembreCommissionComponent } from './membre-commission.component';

describe('MembreCommissionComponent', () => {
  let component: MembreCommissionComponent;
  let fixture: ComponentFixture<MembreCommissionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MembreCommissionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MembreCommissionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
