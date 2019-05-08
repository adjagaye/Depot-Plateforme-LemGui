import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TypeMembreComponent } from './type-membre.component';

describe('TypeMembreComponent', () => {
  let component: TypeMembreComponent;
  let fixture: ComponentFixture<TypeMembreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TypeMembreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TypeMembreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
