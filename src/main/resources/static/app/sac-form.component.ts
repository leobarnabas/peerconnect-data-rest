import { Component } from '@angular/core';

import { Form }    from './form';

@Component({
  moduleId: module.id,
  selector: 'sac-form',
  templateUrl: './sac-form.component.html'
})
export class SacFormComponent {

  gender = ['Male', 'Female',];

  model = new Form(18, 'Ama','Dee', this.gender[0], '12-02-2019','dankwah@gmail.com','deasgg');

  submitted = false;

  onSubmit() { this.submitted = true; }

  // TODO: Remove this when we're done
  get diagnostic() { return JSON.stringify(this.model); }
newform() {
    this.model = new form(18, '', '','','','','');
  }

  skyDog(): form {
    let myform =  new form(42, 'SkyDog',
                           'Fetch any object at any distance',
                           'Leslie Rollover');
    console.log('My hero is called ' + myform.firstname); // "My hero is called SkyDog"
    return myform;
  }

  //////// NOT SHOWN IN DOCS ////////

  // Reveal in html:
  //   Name via form.controls = {{showFormControls(formForm)}}
  showFormControls(form: any) {
    return form && form.controls['firstname'] &&
    form.controls['firstname'].value; // Dr. IQ
  }

  /////////////////////////////

}