import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProComponent } from './pro.component';

describe('ProComponent', () => {
  let component: ProComponent;
  let fixture: ComponentFixture<ProComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ProComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
