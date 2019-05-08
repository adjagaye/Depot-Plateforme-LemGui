import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TypeDonateurComponent } from './type-donateur.component';

describe('TypeDonateurComponent', () => {
  let component: TypeDonateurComponent;
  let fixture: ComponentFixture<TypeDonateurComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TypeDonateurComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TypeDonateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
