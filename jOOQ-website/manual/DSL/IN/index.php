
<?php 
// The following content has been XSL transformed from manual.xml using html-pages.xsl
// Please do not edit this content manually
require '../../../frame.php';
function getH1() {
    return "Nested SELECT using the IN operator";
}
function getActiveMenu() {
	return "manual";
}
function getSlogan() {
	return "
							Set equal operations are very common when you want to select multiple
							records. The IN operator can also be used for semi-joins, though
						";
}
function printContent() {
    global $root;
?>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual</a> : <a href="<?=$root?>/manual/DSL/">DSL or fluent API. Where SQL meets Java</a> : <a href="<?=$root?>/manual/DSL/IN/">Nested SELECT using the IN operator</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Previous section: Aliased tables and fields" href="<?=$root?>/manual/DSL/ALIAS/">previous</a> : <a title="Next section: Nested SELECT using the EXISTS operator" href="<?=$root?>/manual/DSL/EXISTS/">next</a></td>
</tr>
</table>
							<h2>The IN operator for use in semi-joins or anti-joins</h2>
							<p>
								In addition to a list of constant values, the IN operator in
								<a href="https://github.com/lukaseder/jOOQ/blob/master/jOOQ/src/main/java/org/jooq/Field.java" title="Internal API reference: org.jooq.Field">org.jooq.Field</a>
								also supports a
								<a href="https://github.com/lukaseder/jOOQ/blob/master/jOOQ/src/main/java/org/jooq/Select.java" title="Internal API reference: org.jooq.Select">org.jooq.Select</a> as an argument.
								This can be any type of select as
								discussed in the manual's section about
								<a href="<?=$root?>/manual/JOOQ/Query/" title="jOOQ Manual reference: The Query and its various subtypes">Query types</a>.
								However, you must
								ensure yourself, that the provided Select will only select a single
								Field.
							</p>
							<p>Let's say you want to select books by authors born in 1920. Of
								course, this is possible with a plain JOIN as well, but let's say we
								want to use the IN operator. Then you have two possibilities: </p>

							<table cellspacing="0" cellpadding="0" width="100%">
<tr>
<td class="left" width="50%">
<pre class="prettyprint lang-sql">SELECT *
  FROM T_BOOK
 WHERE T_BOOK.AUTHOR_ID IN (
           SELECT ID FROM T_AUTHOR
            WHERE T_AUTHOR.BORN = 1920)

-- OR:

SELECT T_BOOK.*
  FROM T_BOOK
  JOIN T_AUTHOR ON (T_BOOK.AUTHOR_ID = T_AUTHOR.ID
                AND T_AUTHOR.BORN    = 1920)</pre>
</td><td class="right" width="50%">
<pre class="prettyprint lang-java">create.select()
      .from(T_BOOK)
      .where(T_BOOK.AUTHOR_ID.in(
          create.select(T_AUTHOR.ID).from(T_AUTHOR)
                .where(T_AUTHOR.BORN.equal(1920))));

// OR:

create.select(T_BOOK.getFields())
      .from(T_BOOK)
      .join(T_AUTHOR).on(T_BOOK.AUTHOR_ID.equal(TAuthor.ID)
                     .and(T_AUTHOR.BORN.equal(1920)));</pre>
</td>
</tr>
</table>
						<br><table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td valign="top" align="left"><a href="<?=$root?>/manual/">The jOOQ User Manual</a> : <a href="<?=$root?>/manual/DSL/">DSL or fluent API. Where SQL meets Java</a> : <a href="<?=$root?>/manual/DSL/IN/">Nested SELECT using the IN operator</a></td><td style="white-space: nowrap" valign="top" align="right"><a title="Previous section: Aliased tables and fields" href="<?=$root?>/manual/DSL/ALIAS/">previous</a> : <a title="Next section: Nested SELECT using the EXISTS operator" href="<?=$root?>/manual/DSL/EXISTS/">next</a></td>
</tr>
</table>
<?php 
}
?>

