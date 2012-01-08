
<?php 
// The following content has been XSL transformed from manual.xml using html-pages.xsl
// Please do not edit this content manually
require '../../../frame.php';
function getH1() {
    return "Sequences";
}
function getActiveMenu() {
	return "manual";
}
function getSlogan() {
	return "
							jOOQ also generates convenience artefacts for sequences, where this is
							supported: DB2, Derby, H2, HSQLDB, Oracle, Postgres, and more.
						";
}
function printContent() {
    global $root;
?>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual</a> : <a href="<?=$root?>/manual/META/">Meta model code generation</a> : <a href="<?=$root?>/manual/META/SEQUENCE/">Sequences</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Previous section: UDT's including ARRAY and ENUM types" href="<?=$root?>/manual/META/UDT/">previous</a> : <a title="Next section: DSL or fluent API. Where SQL meets Java" href="<?=$root?>/manual/DSL/">next</a></td>
</tr>
</table>
							<h2>Sequences as a source for identity values</h2>
							<p> Sequences implement the
							<a href="https://github.com/lukaseder/jOOQ/blob/master/jOOQ/src/main/java/org/jooq/Sequence.java" title="Internal API reference: org.jooq.Sequence">org.jooq.Sequence</a> interface, providing essentially this functionality:</p>

<pre class="prettyprint lang-java">// Get a field for the CURRVAL sequence property
Field&lt;T&gt; currval();

// Get a field for the NEXTVAL sequence property
Field&lt;T&gt; nextval();</pre>
							<p>So if you have a sequence like this in Oracle: </p>
							<pre class="prettyprint lang-sql">CREATE SEQUENCE s_author_id</pre>
							<p>This is what jOOQ will generate: </p>
<pre class="prettyprint lang-java">public final class Sequences {

    // A static sequence instance
    public static final Sequence&lt;BigInteger&gt; S_AUTHOR_ID = // [...]
}</pre>

							<p>Which you can use in a select statement as such: </p>
<pre class="prettyprint lang-java">Field&lt;BigInteger&gt; s = Sequences.S_AUTHOR_ID.nextval();
BigInteger nextID   = create.select(s).fetchOne(s);</pre>

							<p>Or directly fetch currval() and nextval() from the sequence using the Factory: </p>
<pre class="prettyprint lang-java">BigInteger currval = create.currval(Sequences.S_AUTHOR_ID);
BigInteger nextval = create.nextval(Sequences.S_AUTHOR_ID);</pre>
						<br><table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual</a> : <a href="<?=$root?>/manual/META/">Meta model code generation</a> : <a href="<?=$root?>/manual/META/SEQUENCE/">Sequences</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Previous section: UDT's including ARRAY and ENUM types" href="<?=$root?>/manual/META/UDT/">previous</a> : <a title="Next section: DSL or fluent API. Where SQL meets Java" href="<?=$root?>/manual/DSL/">next</a></td>
</tr>
</table>
<?php 
}
?>

