import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  template: `<nav class="navbar navbar-default navbar-fixed-top" style="background-color:;">
				<div class="container sidenav" >
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
						  <span class="icon-bar"></span>
						  <span class="icon-bar"></span>
						  <span class="icon-bar"></span>
						</button>
					  <a class="navbar-brand " href="index.html" style="color:#28B463;">GYEDZE</a>
					</div>
					<div  id="myNavbar">
					  <ul class="nav navbar-nav navbar-right" >
						<li><a href="Index.html" style="color:#28B463;" >Home</a></li>
						<li><a href="about.html" style="color:#28B463;" >About us</a></li>
						<li><a href="#myModal" data-toggle="modal">Log In </a>

						</li>
					  </ul>
					</div>
				</div>
        	</nav>
			<!-- Footer -->
	<footer class="navbar-fixed-bottom text-center">
	 <div class="row">
        <div class="col-sm-3"><p></p></div>
		<div class="col-sm-3"> ©
	   <script type="text/javascript">
	  document.write(new Date().getFullYear());
	  </script>  Peer Connect Ghana
      </div>
	  <div class="col-sm-2"><a href="Terms and Conditions.html"> Terms and Conditions </a></div>
	 </div>
	</footer>`,
				
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
}
