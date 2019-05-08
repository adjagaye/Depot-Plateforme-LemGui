import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsBureauComponent } from './details-bureau.component';

describe('DetailsBureauComponent', () => {
  let component: DetailsBureauComponent;
  let fixture: ComponentFixture<DetailsBureauComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailsBureauComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsBureauComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
