File index = new File( basedir, "target/site/index.html" )
assert index.exists()
assert 0 == index.getText().count( 'Generated by Apache Maven Doxia at')