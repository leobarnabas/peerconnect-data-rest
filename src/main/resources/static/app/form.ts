export class Form {
  constructor(
    public userid: number,
    public firstname: string,
    public lastname: string,
    public gender?: string,
    public dob: string,
    public email: string,
    public password: string
  ) {  }
}