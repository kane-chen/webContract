<!DOCTYPE HTML>
<html>
<head>
<title>Contract</title>
  <link rel="stylesheet" href="/contract/styles/main.css" type="text/css" />
  <link rel="stylesheet" href="/contract/styles/local.css" type="text/css" />
  <link rel="stylesheet" href="/contract/styles/print.css" type="text/css" media="print" />
</head>
<body class="main tundra">
    <div id="page">
        <div id="mini-header">
			<div id="mini-header-left"></div>
			<div id="mini-header-right"></div>
        </div> <!-- /mini-header -->

	    <div id="primary-navigation">
	        <div id="primary-left">
	            <ul>
	                <li><a href="/contract" title="Admin Console">WebContract</a></li>
	            </ul>
	        </div>
	        <img id="left-curve" src="/contract/images/menu-curve-left.png"/>
	        <div id="primary-right">
	            <ul>
	                <li><a href="/admin" title="Admin Console">Admin Console</a></li>
	                <li><a href="http://www.eclipse.org/virgo" title="Admin Console">Virgo</a></li>
	            </ul>
	        </div>
	        <img id="right-curve" src="/contract/images/menu-curve-right.png"/>
	    </div><!-- /primary-navigation -->

    <div id="container">
        <div id="content-no-nav">
			<h1>Virgo Web Server - Contract sample</h1>
        	<p/>
            <h2>${listing.firstName} ${listing.lastName}</h2>
			<a href="mailto:${listing.emailAddress}">${listing.emailAddress}</a>
        </div> <!-- /content -->
    </div> <!-- /container -->
    
    <div id="footer-wrapper">
        <div id="footer-left">&copy; Copyright 2008, 2010 VMware Inc. Licensed under the Eclipse Public License v1.0.</div>
        <div id="footer-right"></div> 
    </div> <!-- /footer-wrapper -->

  </div> <!-- /page -->

</body>
</html>