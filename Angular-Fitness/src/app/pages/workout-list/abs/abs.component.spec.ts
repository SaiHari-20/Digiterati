import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AbsComponent } from './abs.component';

describe('AbsComponent', () => {
  let component: AbsComponent;
  let fixture: ComponentFixture<AbsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AbsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AbsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
