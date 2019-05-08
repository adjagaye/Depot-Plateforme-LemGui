import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TypeNewsComponent } from './type-news.component';

describe('TypeNewsComponent', () => {
  let component: TypeNewsComponent;
  let fixture: ComponentFixture<TypeNewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TypeNewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TypeNewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
