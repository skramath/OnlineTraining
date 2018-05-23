import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PipexComponent } from './pipex.component';

describe('PipexComponent', () => {
  let component: PipexComponent;
  let fixture: ComponentFixture<PipexComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PipexComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PipexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
