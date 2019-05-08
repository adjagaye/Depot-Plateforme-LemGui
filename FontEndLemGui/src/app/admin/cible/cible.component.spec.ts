import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CibleComponent } from './cible.component';

describe('CibleComponent', () => {
  let component: CibleComponent;
  let fixture: ComponentFixture<CibleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CibleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CibleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
