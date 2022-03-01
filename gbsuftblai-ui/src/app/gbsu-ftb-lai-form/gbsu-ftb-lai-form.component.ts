import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html',
  styleUrls: ['./gbsu-ftb-lai-form.component.css']
})
export class GbsuFtbLaiFormComponent implements OnInit {
  inputNumber: number;

  @Output() submitNumberOutput: EventEmitter<number> = new EventEmitter<number>();
  constructor(private formBuilder: FormBuilder) {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.inputNumber);
  }

}
