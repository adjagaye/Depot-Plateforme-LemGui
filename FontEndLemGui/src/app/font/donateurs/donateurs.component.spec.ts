import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DonateursComponent } from './donateurs.component';

describe('DonateursComponent', () => {
  let component: DonateursComponent;
  let fixture: ComponentFixture<DonateursComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DonateursComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DonateursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
