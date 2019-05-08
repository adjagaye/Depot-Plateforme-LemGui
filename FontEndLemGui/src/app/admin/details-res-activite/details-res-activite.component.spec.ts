import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsResActiviteComponent } from './details-res-activite.component';

describe('DetailsResActiviteComponent', () => {
  let component: DetailsResActiviteComponent;
  let fixture: ComponentFixture<DetailsResActiviteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailsResActiviteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsResActiviteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
