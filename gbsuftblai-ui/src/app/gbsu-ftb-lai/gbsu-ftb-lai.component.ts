import { Component, OnInit, OnDestroy } from '@angular/core';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {
  error: any;
  numberConverteds: NumberConverted[] = [];

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) {}

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    console.log('Hello event number parent', inputNumber);
    this.gbsuFtbLaiService.convertNumberService(inputNumber).subscribe( {
      next: resultValue => this.numberConverteds.push({numberToConvert: inputNumber, result: resultValue.result}),
      error: error => this.error = error
    }
    );
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
