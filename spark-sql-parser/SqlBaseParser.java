// Generated from SqlBaseParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LEFT_PAREN=2, RIGHT_PAREN=3, COMMA=4, DOT=5, LEFT_BRACKET=6, 
		RIGHT_BRACKET=7, ADD=8, AFTER=9, ALL=10, ALTER=11, ALWAYS=12, ANALYZE=13, 
		AND=14, ANTI=15, ANY=16, ANY_VALUE=17, ARCHIVE=18, ARRAY=19, AS=20, ASC=21, 
		AT=22, AUTHORIZATION=23, BETWEEN=24, BOTH=25, BUCKET=26, BUCKETS=27, BY=28, 
		CACHE=29, CASCADE=30, CASE=31, CAST=32, CATALOG=33, CATALOGS=34, CHANGE=35, 
		CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, CODEGEN=40, COLLATE=41, 
		COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, COMMIT=46, COMPACT=47, 
		COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, COST=52, CREATE=53, 
		CROSS=54, CUBE=55, CURRENT=56, CURRENT_DATE=57, CURRENT_TIME=58, CURRENT_TIMESTAMP=59, 
		CURRENT_USER=60, DAY=61, DAYS=62, DAYOFYEAR=63, DATA=64, DATABASE=65, 
		DATABASES=66, DATEADD=67, DATEDIFF=68, DBPROPERTIES=69, DEFAULT=70, DEFINED=71, 
		DELETE=72, DELIMITED=73, DESC=74, DESCRIBE=75, DFS=76, DIRECTORIES=77, 
		DIRECTORY=78, DISTINCT=79, DISTRIBUTE=80, DIV=81, DROP=82, ELSE=83, END=84, 
		ESCAPE=85, ESCAPED=86, EXCEPT=87, EXCHANGE=88, EXCLUDE=89, EXISTS=90, 
		EXPLAIN=91, EXPORT=92, EXTENDED=93, EXTERNAL=94, EXTRACT=95, FALSE=96, 
		FETCH=97, FIELDS=98, FILTER=99, FILEFORMAT=100, FIRST=101, FOLLOWING=102, 
		FOR=103, FOREIGN=104, FORMAT=105, FORMATTED=106, FROM=107, FULL=108, FUNCTION=109, 
		FUNCTIONS=110, GENERATED=111, GLOBAL=112, GRANT=113, GROUP=114, GROUPING=115, 
		HAVING=116, HOUR=117, HOURS=118, IF=119, IGNORE=120, IMPORT=121, IN=122, 
		INCLUDE=123, INDEX=124, INDEXES=125, INNER=126, INPATH=127, INPUTFORMAT=128, 
		INSERT=129, INTERSECT=130, INTERVAL=131, INTO=132, IS=133, ITEMS=134, 
		JOIN=135, KEYS=136, LAST=137, LATERAL=138, LAZY=139, LEADING=140, LEFT=141, 
		LIKE=142, ILIKE=143, LIMIT=144, LINES=145, LIST=146, LOAD=147, LOCAL=148, 
		LOCATION=149, LOCK=150, LOCKS=151, LOGICAL=152, MACRO=153, MAP=154, MATCHED=155, 
		MERGE=156, MICROSECOND=157, MICROSECONDS=158, MILLISECOND=159, MILLISECONDS=160, 
		MINUTE=161, MINUTES=162, MONTH=163, MONTHS=164, MSCK=165, NAMESPACE=166, 
		NAMESPACES=167, NANOSECOND=168, NANOSECONDS=169, NATURAL=170, NO=171, 
		NOT=172, NULL=173, NULLS=174, OF=175, OFFSET=176, ON=177, ONLY=178, OPTION=179, 
		OPTIONS=180, OR=181, ORDER=182, OUT=183, OUTER=184, OUTPUTFORMAT=185, 
		OVER=186, OVERLAPS=187, OVERLAY=188, OVERWRITE=189, PARTITION=190, PARTITIONED=191, 
		PARTITIONS=192, PERCENTILE_CONT=193, PERCENTILE_DISC=194, PERCENTLIT=195, 
		PIVOT=196, PLACING=197, POSITION=198, PRECEDING=199, PRIMARY=200, PRINCIPALS=201, 
		PROPERTIES=202, PURGE=203, QUARTER=204, QUERY=205, RANGE=206, RECORDREADER=207, 
		RECORDWRITER=208, RECOVER=209, REDUCE=210, REFERENCES=211, REFRESH=212, 
		RENAME=213, REPAIR=214, REPEATABLE=215, REPLACE=216, RESET=217, RESPECT=218, 
		RESTRICT=219, REVOKE=220, RIGHT=221, RLIKE=222, ROLE=223, ROLES=224, ROLLBACK=225, 
		ROLLUP=226, ROW=227, ROWS=228, SECOND=229, SECONDS=230, SCHEMA=231, SCHEMAS=232, 
		SELECT=233, SEMI=234, SEPARATED=235, SERDE=236, SERDEPROPERTIES=237, SESSION_USER=238, 
		SET=239, SETMINUS=240, SETS=241, SHOW=242, SKEWED=243, SOME=244, SORT=245, 
		SORTED=246, SOURCE=247, START=248, STATISTICS=249, STORED=250, STRATIFY=251, 
		STRUCT=252, SUBSTR=253, SUBSTRING=254, SYNC=255, SYSTEM_TIME=256, SYSTEM_VERSION=257, 
		TABLE=258, TABLES=259, TABLESAMPLE=260, TARGET=261, TBLPROPERTIES=262, 
		TEMPORARY=263, TERMINATED=264, THEN=265, TIME=266, TIMESTAMP=267, TIMESTAMPADD=268, 
		TIMESTAMPDIFF=269, TO=270, TOUCH=271, TRAILING=272, TRANSACTION=273, TRANSACTIONS=274, 
		TRANSFORM=275, TRIM=276, TRUE=277, TRUNCATE=278, TRY_CAST=279, TYPE=280, 
		UNARCHIVE=281, UNBOUNDED=282, UNCACHE=283, UNION=284, UNIQUE=285, UNKNOWN=286, 
		UNLOCK=287, UNPIVOT=288, UNSET=289, UPDATE=290, USE=291, USER=292, USING=293, 
		VALUES=294, VERSION=295, VIEW=296, VIEWS=297, WEEK=298, WEEKS=299, WHEN=300, 
		WHERE=301, WINDOW=302, WITH=303, WITHIN=304, YEAR=305, YEARS=306, ZONE=307, 
		EQ=308, NSEQ=309, NEQ=310, NEQJ=311, LT=312, LTE=313, GT=314, GTE=315, 
		PLUS=316, MINUS=317, ASTERISK=318, SLASH=319, PERCENT=320, TILDE=321, 
		AMPERSAND=322, PIPE=323, CONCAT_PIPE=324, HAT=325, COLON=326, ARROW=327, 
		HENT_START=328, HENT_END=329, STRING=330, DOUBLEQUOTED_STRING=331, BIGINT_LITERAL=332, 
		SMALLINT_LITERAL=333, TINYINT_LITERAL=334, INTEGER_VALUE=335, EXPONENT_VALUE=336, 
		DECIMAL_VALUE=337, FLOAT_LITERAL=338, DOUBLE_LITERAL=339, BIGDECIMAL_LITERAL=340, 
		IDENTIFIER=341, BACKQUOTED_IDENTIFIER=342, SIMPLE_COMMENT=343, BRACKETED_COMMENT=344, 
		WS=345, UNRECOGNIZED=346;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_timezone = 8, RULE_configKey = 9, RULE_configValue = 10, RULE_unsupportedHiveNativeCommands = 11, 
		RULE_createTableHeader = 12, RULE_replaceTableHeader = 13, RULE_bucketSpec = 14, 
		RULE_skewSpec = 15, RULE_locationSpec = 16, RULE_commentSpec = 17, RULE_query = 18, 
		RULE_insertInto = 19, RULE_partitionSpecLocation = 20, RULE_partitionSpec = 21, 
		RULE_partitionVal = 22, RULE_namespace = 23, RULE_namespaces = 24, RULE_describeFuncName = 25, 
		RULE_describeColName = 26, RULE_ctes = 27, RULE_namedQuery = 28, RULE_tableProvider = 29, 
		RULE_createTableClauses = 30, RULE_propertyList = 31, RULE_property = 32, 
		RULE_propertyKey = 33, RULE_propertyValue = 34, RULE_constantList = 35, 
		RULE_nestedConstantList = 36, RULE_createFileFormat = 37, RULE_fileFormat = 38, 
		RULE_storageHandler = 39, RULE_resource = 40, RULE_dmlStatementNoWith = 41, 
		RULE_queryOrganization = 42, RULE_multiInsertQueryBody = 43, RULE_queryTerm = 44, 
		RULE_queryPrimary = 45, RULE_sortItem = 46, RULE_fromStatement = 47, RULE_fromStatementBody = 48, 
		RULE_querySpecification = 49, RULE_transformClause = 50, RULE_selectClause = 51, 
		RULE_setClause = 52, RULE_matchedClause = 53, RULE_notMatchedClause = 54, 
		RULE_notMatchedBySourceClause = 55, RULE_matchedAction = 56, RULE_notMatchedAction = 57, 
		RULE_notMatchedBySourceAction = 58, RULE_assignmentList = 59, RULE_assignment = 60, 
		RULE_whereClause = 61, RULE_havingClause = 62, RULE_hint = 63, RULE_hintStatement = 64, 
		RULE_fromClause = 65, RULE_temporalClause = 66, RULE_aggregationClause = 67, 
		RULE_groupByClause = 68, RULE_groupingAnalytics = 69, RULE_groupingElement = 70, 
		RULE_groupingSet = 71, RULE_pivotClause = 72, RULE_pivotColumn = 73, RULE_pivotValue = 74, 
		RULE_unpivotClause = 75, RULE_unpivotNullClause = 76, RULE_unpivotOperator = 77, 
		RULE_unpivotSingleValueColumnClause = 78, RULE_unpivotMultiValueColumnClause = 79, 
		RULE_unpivotColumnSet = 80, RULE_unpivotValueColumn = 81, RULE_unpivotNameColumn = 82, 
		RULE_unpivotColumnAndAlias = 83, RULE_unpivotColumn = 84, RULE_unpivotAlias = 85, 
		RULE_lateralView = 86, RULE_setQuantifier = 87, RULE_relation = 88, RULE_relationExtension = 89, 
		RULE_joinRelation = 90, RULE_joinType = 91, RULE_joinCriteria = 92, RULE_sample = 93, 
		RULE_sampleMethod = 94, RULE_identifierList = 95, RULE_identifierSeq = 96, 
		RULE_orderedIdentifierList = 97, RULE_orderedIdentifier = 98, RULE_identifierCommentList = 99, 
		RULE_identifierComment = 100, RULE_relationPrimary = 101, RULE_inlineTable = 102, 
		RULE_functionTable = 103, RULE_tableAlias = 104, RULE_rowFormat = 105, 
		RULE_multipartIdentifierList = 106, RULE_multipartIdentifier = 107, RULE_multipartIdentifierPropertyList = 108, 
		RULE_multipartIdentifierProperty = 109, RULE_tableIdentifier = 110, RULE_functionIdentifier = 111, 
		RULE_namedExpression = 112, RULE_namedExpressionSeq = 113, RULE_partitionFieldList = 114, 
		RULE_partitionField = 115, RULE_transform = 116, RULE_transformArgument = 117, 
		RULE_expression = 118, RULE_expressionSeq = 119, RULE_booleanExpression = 120, 
		RULE_predicate = 121, RULE_valueExpression = 122, RULE_datetimeUnit = 123, 
		RULE_primaryExpression = 124, RULE_constant = 125, RULE_comparisonOperator = 126, 
		RULE_arithmeticOperator = 127, RULE_predicateOperator = 128, RULE_booleanValue = 129, 
		RULE_interval = 130, RULE_errorCapturingMultiUnitsInterval = 131, RULE_multiUnitsInterval = 132, 
		RULE_errorCapturingUnitToUnitInterval = 133, RULE_unitToUnitInterval = 134, 
		RULE_intervalValue = 135, RULE_unitInMultiUnits = 136, RULE_unitInUnitToUnit = 137, 
		RULE_colPosition = 138, RULE_dataType = 139, RULE_qualifiedColTypeWithPositionList = 140, 
		RULE_qualifiedColTypeWithPosition = 141, RULE_defaultExpression = 142, 
		RULE_colTypeList = 143, RULE_colType = 144, RULE_createOrReplaceTableColTypeList = 145, 
		RULE_createOrReplaceTableColType = 146, RULE_colDefinitionOption = 147, 
		RULE_generationExpression = 148, RULE_complexColTypeList = 149, RULE_complexColType = 150, 
		RULE_whenClause = 151, RULE_windowClause = 152, RULE_namedWindow = 153, 
		RULE_windowSpec = 154, RULE_windowFrame = 155, RULE_frameBound = 156, 
		RULE_qualifiedNameList = 157, RULE_functionName = 158, RULE_qualifiedName = 159, 
		RULE_errorCapturingIdentifier = 160, RULE_errorCapturingIdentifierExtra = 161, 
		RULE_identifier = 162, RULE_strictIdentifier = 163, RULE_quotedIdentifier = 164, 
		RULE_backQuotedIdentifier = 165, RULE_number = 166, RULE_alterColumnAction = 167, 
		RULE_stringLit = 168, RULE_comment = 169, RULE_version = 170, RULE_ansiNonReserved = 171, 
		RULE_strictNonReserved = 172, RULE_nonReserved = 173;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"timezone", "configKey", "configValue", "unsupportedHiveNativeCommands", 
			"createTableHeader", "replaceTableHeader", "bucketSpec", "skewSpec", 
			"locationSpec", "commentSpec", "query", "insertInto", "partitionSpecLocation", 
			"partitionSpec", "partitionVal", "namespace", "namespaces", "describeFuncName", 
			"describeColName", "ctes", "namedQuery", "tableProvider", "createTableClauses", 
			"propertyList", "property", "propertyKey", "propertyValue", "constantList", 
			"nestedConstantList", "createFileFormat", "fileFormat", "storageHandler", 
			"resource", "dmlStatementNoWith", "queryOrganization", "multiInsertQueryBody", 
			"queryTerm", "queryPrimary", "sortItem", "fromStatement", "fromStatementBody", 
			"querySpecification", "transformClause", "selectClause", "setClause", 
			"matchedClause", "notMatchedClause", "notMatchedBySourceClause", "matchedAction", 
			"notMatchedAction", "notMatchedBySourceAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"temporalClause", "aggregationClause", "groupByClause", "groupingAnalytics", 
			"groupingElement", "groupingSet", "pivotClause", "pivotColumn", "pivotValue", 
			"unpivotClause", "unpivotNullClause", "unpivotOperator", "unpivotSingleValueColumnClause", 
			"unpivotMultiValueColumnClause", "unpivotColumnSet", "unpivotValueColumn", 
			"unpivotNameColumn", "unpivotColumnAndAlias", "unpivotColumn", "unpivotAlias", 
			"lateralView", "setQuantifier", "relation", "relationExtension", "joinRelation", 
			"joinType", "joinCriteria", "sample", "sampleMethod", "identifierList", 
			"identifierSeq", "orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
			"identifierComment", "relationPrimary", "inlineTable", "functionTable", 
			"tableAlias", "rowFormat", "multipartIdentifierList", "multipartIdentifier", 
			"multipartIdentifierPropertyList", "multipartIdentifierProperty", "tableIdentifier", 
			"functionIdentifier", "namedExpression", "namedExpressionSeq", "partitionFieldList", 
			"partitionField", "transform", "transformArgument", "expression", "expressionSeq", 
			"booleanExpression", "predicate", "valueExpression", "datetimeUnit", 
			"primaryExpression", "constant", "comparisonOperator", "arithmeticOperator", 
			"predicateOperator", "booleanValue", "interval", "errorCapturingMultiUnitsInterval", 
			"multiUnitsInterval", "errorCapturingUnitToUnitInterval", "unitToUnitInterval", 
			"intervalValue", "unitInMultiUnits", "unitInUnitToUnit", "colPosition", 
			"dataType", "qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", 
			"defaultExpression", "colTypeList", "colType", "createOrReplaceTableColTypeList", 
			"createOrReplaceTableColType", "colDefinitionOption", "generationExpression", 
			"complexColTypeList", "complexColType", "whenClause", "windowClause", 
			"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedNameList", 
			"functionName", "qualifiedName", "errorCapturingIdentifier", "errorCapturingIdentifierExtra", 
			"identifier", "strictIdentifier", "quotedIdentifier", "backQuotedIdentifier", 
			"number", "alterColumnAction", "stringLit", "comment", "version", "ansiNonReserved", 
			"strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'['", "']'", "'ADD'", "'AFTER'", 
			"'ALL'", "'ALTER'", "'ALWAYS'", "'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", 
			"'ANY_VALUE'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CATALOG'", "'CATALOGS'", "'CHANGE'", "'CHECK'", 
			"'CLEAR'", "'CLUSTER'", "'CLUSTERED'", "'CODEGEN'", "'COLLATE'", "'COLLECTION'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", "'COMPACTIONS'", 
			"'COMPUTE'", "'CONCATENATE'", "'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", 
			"'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DAY'", "'DAYS'", "'DAYOFYEAR'", "'DATA'", "'DATABASE'", 
			"'DATABASES'", "'DATEADD'", "'DATEDIFF'", "'DBPROPERTIES'", "'DEFAULT'", 
			"'DEFINED'", "'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", 
			"'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", 
			"'DROP'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", 
			"'EXCLUDE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", 
			"'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", 
			"'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", 
			"'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GENERATED'", "'GLOBAL'", 
			"'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", "'HOURS'", 
			"'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INCLUDE'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
			"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'ILIKE'", "'LIMIT'", "'LINES'", 
			"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MICROSECOND'", "'MICROSECONDS'", 
			"'MILLISECOND'", "'MILLISECONDS'", "'MINUTE'", "'MINUTES'", "'MONTH'", 
			"'MONTHS'", "'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NANOSECOND'", 
			"'NANOSECONDS'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", 
			"'OFFSET'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", 
			"'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", 
			"'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENTILE_CONT'", 
			"'PERCENTILE_DISC'", "'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", 
			"'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", 
			"'QUARTER'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", 
			"'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", 
			"'ROWS'", "'SECOND'", "'SECONDS'", "'SCHEMA'", "'SCHEMAS'", "'SELECT'", 
			"'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", 
			"'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", 
			"'SORTED'", "'SOURCE'", "'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", 
			"'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", "'SYSTEM_TIME'", "'SYSTEM_VERSION'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TARGET'", "'TBLPROPERTIES'", 
			null, "'TERMINATED'", "'THEN'", "'TIME'", "'TIMESTAMP'", "'TIMESTAMPADD'", 
			"'TIMESTAMPDIFF'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TRY_CAST'", 
			"'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", 
			"'UNKNOWN'", "'UNLOCK'", "'UNPIVOT'", "'UNSET'", "'UPDATE'", "'USE'", 
			"'USER'", "'USING'", "'VALUES'", "'VERSION'", "'VIEW'", "'VIEWS'", "'WEEK'", 
			"'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'WITHIN'", "'YEAR'", 
			"'YEARS'", "'ZONE'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", 
			"'^'", "':'", "'->'", "'/*+'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "ADD", "AFTER", "ALL", "ALTER", "ALWAYS", "ANALYZE", 
			"AND", "ANTI", "ANY", "ANY_VALUE", "ARCHIVE", "ARRAY", "AS", "ASC", "AT", 
			"AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", "BUCKETS", "BY", "CACHE", 
			"CASCADE", "CASE", "CAST", "CATALOG", "CATALOGS", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DAY", "DAYS", "DAYOFYEAR", "DATA", "DATABASE", "DATABASES", "DATEADD", 
			"DATEDIFF", "DBPROPERTIES", "DEFAULT", "DEFINED", "DELETE", "DELIMITED", 
			"DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", "DISTRIBUTE", 
			"DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", 
			"EXCLUDE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GENERATED", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", 
			"HOUR", "HOURS", "IF", "IGNORE", "IMPORT", "IN", "INCLUDE", "INDEX", 
			"INDEXES", "INNER", "INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", 
			"INTO", "IS", "ITEMS", "JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", 
			"LEFT", "LIKE", "ILIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", 
			"LOCK", "LOCKS", "LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", "MICROSECOND", 
			"MICROSECONDS", "MILLISECOND", "MILLISECONDS", "MINUTE", "MINUTES", "MONTH", 
			"MONTHS", "MSCK", "NAMESPACE", "NAMESPACES", "NANOSECOND", "NANOSECONDS", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "OFFSET", "ON", "ONLY", 
			"OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", 
			"OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", 
			"PERCENTILE_CONT", "PERCENTILE_DISC", "PERCENTLIT", "PIVOT", "PLACING", 
			"POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", 
			"QUARTER", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", 
			"REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPEATABLE", 
			"REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", 
			"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SECOND", "SECONDS", 
			"SCHEMA", "SCHEMAS", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
			"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", 
			"SORT", "SORTED", "SOURCE", "START", "STATISTICS", "STORED", "STRATIFY", 
			"STRUCT", "SUBSTR", "SUBSTRING", "SYNC", "SYSTEM_TIME", "SYSTEM_VERSION", 
			"TABLE", "TABLES", "TABLESAMPLE", "TARGET", "TBLPROPERTIES", "TEMPORARY", 
			"TERMINATED", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPADD", "TIMESTAMPDIFF", 
			"TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", 
			"TRIM", "TRUE", "TRUNCATE", "TRY_CAST", "TYPE", "UNARCHIVE", "UNBOUNDED", 
			"UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNPIVOT", "UNSET", 
			"UPDATE", "USE", "USER", "USING", "VALUES", "VERSION", "VIEW", "VIEWS", 
			"WEEK", "WEEKS", "WHEN", "WHERE", "WINDOW", "WITH", "WITHIN", "YEAR", 
			"YEARS", "ZONE", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "TILDE", "AMPERSAND", 
			"PIPE", "CONCAT_PIPE", "HAT", "COLON", "ARROW", "HENT_START", "HENT_END", 
			"STRING", "DOUBLEQUOTED_STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBaseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	  /**
	   * When true, double quoted literals are identifiers rather than STRINGs.
	   */
	  public boolean double_quoted_identifiers = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SqlBaseParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SqlBaseParser.SEMICOLON, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			statement();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(349);
				match(SEMICOLON);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			namedExpression();
			setState(358);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleTableIdentifier(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			tableIdentifier();
			setState(361);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleMultipartIdentifier(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			multipartIdentifier();
			setState(364);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleFunctionIdentifier(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			functionIdentifier();
			setState(367);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleDataType(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			dataType();
			setState(370);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleTableSchema(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			colTypeList();
			setState(373);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExplain(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResetConfiguration(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterViewQuery(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropNamespace(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTempViewUsing(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFailNativeCommand(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetCatalogContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public SetCatalogContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetCatalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetCatalog(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitClearCache(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropView(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTablesContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTables(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRecoverPartitions(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropIndexContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public DropIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropIndex(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCatalogsContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCatalogs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCurrentNamespace(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTablePartition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRepairTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshResource(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCreateTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowNamespacesContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public NamespacesContext namespaces() {
			return getRuleContext(NamespacesContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowNamespaces(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowColumns(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitReplaceTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnalyzeTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnalyzeTables(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAddTablePartition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetNamespaceLocation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetNamespaceProperties(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitManageResource(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetQuotedConfiguration(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnalyze(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateFunctionContext extends StatementContext {
		public StringLitContext className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateFunction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHiveReplaceColumns(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentNamespaceContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentNamespace(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResetQuotedConfiguration(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDmlStatement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public PropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableLike(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUncacheTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropFunction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeRelation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoadDataContext extends StatementContext {
		public StringLitContext path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLoadData(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowPartitions(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeFunction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTableColumn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStatementDefault(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHiveChangeColumn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTimeZoneContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimezoneContext timezone() {
			return getRuleContext(TimezoneContext.class,0);
		}
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTimeZone(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeQuery(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTruncateTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableSerDe(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateView(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTablePartitions(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetConfiguration(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTableExtendedContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTableExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTableExtended(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeNamespace(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterTableAlterColumn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshFunction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateIndexContext extends StatementContext {
		public IdentifierContext indexType;
		public MultipartIdentifierPropertyListContext columns;
		public PropertyListContext options;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() {
			return getRuleContext(MultipartIdentifierPropertyListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateIndex(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseNamespaceContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUseNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUseNamespace(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateNamespace(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public PropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTblProperties(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnsetTableProperties(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableLocation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTableColumns(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowViewsContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowViews(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowFunctionsContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public MultipartIdentifierContext legacy;
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowFunctions(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CacheTableContext extends StatementContext {
		public PropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCacheTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAddTableColumns(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableProperties(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(376);
					ctes();
					}
				}

				setState(379);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(USE);
				setState(381);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new UseNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				match(USE);
				setState(383);
				namespace();
				setState(384);
				multipartIdentifier();
				}
				break;
			case 5:
				_localctx = new SetCatalogContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(SET);
				setState(387);
				match(CATALOG);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(388);
					identifier();
					}
					break;
				case 2:
					{
					setState(389);
					stringLit();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				match(CREATE);
				setState(393);
				namespace();
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(394);
					match(IF);
					setState(395);
					match(NOT);
					setState(396);
					match(EXISTS);
					}
					break;
				}
				setState(399);
				multipartIdentifier();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(400);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(401);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(402);
						match(WITH);
						setState(403);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(404);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(410);
				match(ALTER);
				setState(411);
				namespace();
				setState(412);
				multipartIdentifier();
				setState(413);
				match(SET);
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				propertyList();
				}
				break;
			case 8:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(417);
				match(ALTER);
				setState(418);
				namespace();
				setState(419);
				multipartIdentifier();
				setState(420);
				match(SET);
				setState(421);
				locationSpec();
				}
				break;
			case 9:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(423);
				match(DROP);
				setState(424);
				namespace();
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(425);
					match(IF);
					setState(426);
					match(EXISTS);
					}
					break;
				}
				setState(429);
				multipartIdentifier();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(430);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 10:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(433);
				match(SHOW);
				setState(434);
				namespaces();
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(435);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(436);
					multipartIdentifier();
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(440);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(439);
						match(LIKE);
						}
						break;
					}
					setState(442);
					((ShowNamespacesContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(445);
				createTableHeader();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(446);
					match(LEFT_PAREN);
					setState(447);
					createOrReplaceTableColTypeList();
					setState(448);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(452);
					tableProvider();
					}
				}

				setState(455);
				createTableClauses();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & 281474985099265L) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(456);
						match(AS);
						}
					}

					setState(459);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(462);
				match(CREATE);
				setState(463);
				match(TABLE);
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(464);
					match(IF);
					setState(465);
					match(NOT);
					setState(466);
					match(EXISTS);
					}
					break;
				}
				setState(469);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(470);
				match(LIKE);
				setState(471);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 227)) & ~0x3f) == 0 && ((1L << (_la - 227)) & 34368126977L) != 0) || _la==USING) {
					{
					setState(478);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(472);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(473);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(474);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(475);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(476);
						match(TBLPROPERTIES);
						setState(477);
						((CreateTableLikeContext)_localctx).tableProps = propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(483);
				replaceTableHeader();
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(484);
					match(LEFT_PAREN);
					setState(485);
					createOrReplaceTableColTypeList();
					setState(486);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(490);
					tableProvider();
					}
				}

				setState(493);
				createTableClauses();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & 281474985099265L) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(494);
						match(AS);
						}
					}

					setState(497);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(500);
				match(ANALYZE);
				setState(501);
				match(TABLE);
				setState(502);
				multipartIdentifier();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(503);
					partitionSpec();
					}
				}

				setState(506);
				match(COMPUTE);
				setState(507);
				match(STATISTICS);
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(508);
					identifier();
					}
					break;
				case 2:
					{
					setState(509);
					match(FOR);
					setState(510);
					match(COLUMNS);
					setState(511);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(512);
					match(FOR);
					setState(513);
					match(ALL);
					setState(514);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(517);
				match(ANALYZE);
				setState(518);
				match(TABLES);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(519);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(520);
					multipartIdentifier();
					}
				}

				setState(523);
				match(COMPUTE);
				setState(524);
				match(STATISTICS);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(525);
					identifier();
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(528);
				match(ALTER);
				setState(529);
				match(TABLE);
				setState(530);
				multipartIdentifier();
				setState(531);
				match(ADD);
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(533);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 17:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(535);
				match(ALTER);
				setState(536);
				match(TABLE);
				setState(537);
				multipartIdentifier();
				setState(538);
				match(ADD);
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				match(LEFT_PAREN);
				setState(541);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(542);
				match(RIGHT_PAREN);
				}
				break;
			case 18:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(544);
				match(ALTER);
				setState(545);
				match(TABLE);
				setState(546);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(547);
				match(RENAME);
				setState(548);
				match(COLUMN);
				setState(549);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(550);
				match(TO);
				setState(551);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(553);
				match(ALTER);
				setState(554);
				match(TABLE);
				setState(555);
				multipartIdentifier();
				setState(556);
				match(DROP);
				setState(557);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(558);
					match(IF);
					setState(559);
					match(EXISTS);
					}
				}

				setState(562);
				match(LEFT_PAREN);
				setState(563);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(564);
				match(RIGHT_PAREN);
				}
				break;
			case 20:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(566);
				match(ALTER);
				setState(567);
				match(TABLE);
				setState(568);
				multipartIdentifier();
				setState(569);
				match(DROP);
				setState(570);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(571);
					match(IF);
					setState(572);
					match(EXISTS);
					}
					break;
				}
				setState(575);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 21:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(577);
				match(ALTER);
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(580);
				match(RENAME);
				setState(581);
				match(TO);
				setState(582);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 22:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(584);
				match(ALTER);
				setState(585);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(586);
				multipartIdentifier();
				setState(587);
				match(SET);
				setState(588);
				match(TBLPROPERTIES);
				setState(589);
				propertyList();
				}
				break;
			case 23:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(591);
				match(ALTER);
				setState(592);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(593);
				multipartIdentifier();
				setState(594);
				match(UNSET);
				setState(595);
				match(TBLPROPERTIES);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(596);
					match(IF);
					setState(597);
					match(EXISTS);
					}
				}

				setState(600);
				propertyList();
				}
				break;
			case 24:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(602);
				match(ALTER);
				setState(603);
				match(TABLE);
				setState(604);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(605);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(606);
					match(COLUMN);
					}
					break;
				}
				setState(609);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(610);
					alterColumnAction();
					}
				}

				}
				break;
			case 25:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(613);
				match(ALTER);
				setState(614);
				match(TABLE);
				setState(615);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(616);
					partitionSpec();
					}
				}

				setState(619);
				match(CHANGE);
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(620);
					match(COLUMN);
					}
					break;
				}
				setState(623);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(624);
				colType();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(625);
					colPosition();
					}
				}

				}
				break;
			case 26:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(628);
				match(ALTER);
				setState(629);
				match(TABLE);
				setState(630);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(631);
					partitionSpec();
					}
				}

				setState(634);
				match(REPLACE);
				setState(635);
				match(COLUMNS);
				setState(636);
				match(LEFT_PAREN);
				setState(637);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(638);
				match(RIGHT_PAREN);
				}
				break;
			case 27:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(640);
				match(ALTER);
				setState(641);
				match(TABLE);
				setState(642);
				multipartIdentifier();
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(643);
					partitionSpec();
					}
				}

				setState(646);
				match(SET);
				setState(647);
				match(SERDE);
				setState(648);
				stringLit();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(649);
					match(WITH);
					setState(650);
					match(SERDEPROPERTIES);
					setState(651);
					propertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(654);
				match(ALTER);
				setState(655);
				match(TABLE);
				setState(656);
				multipartIdentifier();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(657);
					partitionSpec();
					}
				}

				setState(660);
				match(SET);
				setState(661);
				match(SERDEPROPERTIES);
				setState(662);
				propertyList();
				}
				break;
			case 29:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(664);
				match(ALTER);
				setState(665);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(666);
				multipartIdentifier();
				setState(667);
				match(ADD);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(668);
					match(IF);
					setState(669);
					match(NOT);
					setState(670);
					match(EXISTS);
					}
				}

				setState(674); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(673);
					partitionSpecLocation();
					}
					}
					setState(676); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 30:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(678);
				match(ALTER);
				setState(679);
				match(TABLE);
				setState(680);
				multipartIdentifier();
				setState(681);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(682);
				match(RENAME);
				setState(683);
				match(TO);
				setState(684);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 31:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(686);
				match(ALTER);
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(688);
				multipartIdentifier();
				setState(689);
				match(DROP);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(690);
					match(IF);
					setState(691);
					match(EXISTS);
					}
				}

				setState(694);
				partitionSpec();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(695);
					match(COMMA);
					setState(696);
					partitionSpec();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(702);
					match(PURGE);
					}
				}

				}
				break;
			case 32:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(705);
				match(ALTER);
				setState(706);
				match(TABLE);
				setState(707);
				multipartIdentifier();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(708);
					partitionSpec();
					}
				}

				setState(711);
				match(SET);
				setState(712);
				locationSpec();
				}
				break;
			case 33:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(714);
				match(ALTER);
				setState(715);
				match(TABLE);
				setState(716);
				multipartIdentifier();
				setState(717);
				match(RECOVER);
				setState(718);
				match(PARTITIONS);
				}
				break;
			case 34:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(720);
				match(DROP);
				setState(721);
				match(TABLE);
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(722);
					match(IF);
					setState(723);
					match(EXISTS);
					}
					break;
				}
				setState(726);
				multipartIdentifier();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(727);
					match(PURGE);
					}
				}

				}
				break;
			case 35:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(730);
				match(DROP);
				setState(731);
				match(VIEW);
				setState(734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(732);
					match(IF);
					setState(733);
					match(EXISTS);
					}
					break;
				}
				setState(736);
				multipartIdentifier();
				}
				break;
			case 36:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(737);
				match(CREATE);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(738);
					match(OR);
					setState(739);
					match(REPLACE);
					}
				}

				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(742);
						match(GLOBAL);
						}
					}

					setState(745);
					match(TEMPORARY);
					}
				}

				setState(748);
				match(VIEW);
				setState(752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(749);
					match(IF);
					setState(750);
					match(NOT);
					setState(751);
					match(EXISTS);
					}
					break;
				}
				setState(754);
				multipartIdentifier();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(755);
					identifierCommentList();
					}
				}

				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(764);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(758);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(759);
						match(PARTITIONED);
						setState(760);
						match(ON);
						setState(761);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(762);
						match(TBLPROPERTIES);
						setState(763);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(769);
				match(AS);
				setState(770);
				query();
				}
				break;
			case 37:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(772);
				match(CREATE);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(773);
					match(OR);
					setState(774);
					match(REPLACE);
					}
				}

				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(777);
					match(GLOBAL);
					}
				}

				setState(780);
				match(TEMPORARY);
				setState(781);
				match(VIEW);
				setState(782);
				tableIdentifier();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(783);
					match(LEFT_PAREN);
					setState(784);
					colTypeList();
					setState(785);
					match(RIGHT_PAREN);
					}
				}

				setState(789);
				tableProvider();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(790);
					match(OPTIONS);
					setState(791);
					propertyList();
					}
				}

				}
				break;
			case 38:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(794);
				match(ALTER);
				setState(795);
				match(VIEW);
				setState(796);
				multipartIdentifier();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(797);
					match(AS);
					}
				}

				setState(800);
				query();
				}
				break;
			case 39:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(802);
				match(CREATE);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(803);
					match(OR);
					setState(804);
					match(REPLACE);
					}
				}

				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(807);
					match(TEMPORARY);
					}
				}

				setState(810);
				match(FUNCTION);
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(811);
					match(IF);
					setState(812);
					match(NOT);
					setState(813);
					match(EXISTS);
					}
					break;
				}
				setState(816);
				multipartIdentifier();
				setState(817);
				match(AS);
				setState(818);
				((CreateFunctionContext)_localctx).className = stringLit();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(819);
					match(USING);
					setState(820);
					resource();
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(821);
						match(COMMA);
						setState(822);
						resource();
						}
						}
						setState(827);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 40:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(830);
				match(DROP);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(831);
					match(TEMPORARY);
					}
				}

				setState(834);
				match(FUNCTION);
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(835);
					match(IF);
					setState(836);
					match(EXISTS);
					}
					break;
				}
				setState(839);
				multipartIdentifier();
				}
				break;
			case 41:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(840);
				match(EXPLAIN);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 576460752303431681L) != 0)) {
					{
					setState(841);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 576460752303431681L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(844);
				statement();
				}
				break;
			case 42:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(845);
				match(SHOW);
				setState(846);
				match(TABLES);
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(847);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(848);
					multipartIdentifier();
					}
					break;
				}
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(851);
						match(LIKE);
						}
						break;
					}
					setState(854);
					((ShowTablesContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 43:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(857);
				match(SHOW);
				setState(858);
				match(TABLE);
				setState(859);
				match(EXTENDED);
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(860);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(861);
					((ShowTableExtendedContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(864);
				match(LIKE);
				setState(865);
				((ShowTableExtendedContext)_localctx).pattern = stringLit();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(866);
					partitionSpec();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(869);
				match(SHOW);
				setState(870);
				match(TBLPROPERTIES);
				setState(871);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(872);
					match(LEFT_PAREN);
					setState(873);
					((ShowTblPropertiesContext)_localctx).key = propertyKey();
					setState(874);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(878);
				match(SHOW);
				setState(879);
				match(COLUMNS);
				setState(880);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(881);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(882);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(883);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(886);
				match(SHOW);
				setState(887);
				match(VIEWS);
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(888);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(889);
					multipartIdentifier();
					}
					break;
				}
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(892);
						match(LIKE);
						}
						break;
					}
					setState(895);
					((ShowViewsContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(898);
				match(SHOW);
				setState(899);
				match(PARTITIONS);
				setState(900);
				multipartIdentifier();
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(901);
					partitionSpec();
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(904);
				match(SHOW);
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(905);
					identifier();
					}
					break;
				}
				setState(908);
				match(FUNCTIONS);
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(909);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(910);
					((ShowFunctionsContext)_localctx).ns = multipartIdentifier();
					}
					break;
				}
				setState(920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(914);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(913);
						match(LIKE);
						}
						break;
					}
					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(916);
						((ShowFunctionsContext)_localctx).legacy = multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(917);
						((ShowFunctionsContext)_localctx).pattern = stringLit();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 49:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(922);
				match(SHOW);
				setState(923);
				match(CREATE);
				setState(924);
				match(TABLE);
				setState(925);
				multipartIdentifier();
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(926);
					match(AS);
					setState(927);
					match(SERDE);
					}
				}

				}
				break;
			case 50:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(930);
				match(SHOW);
				setState(931);
				match(CURRENT);
				setState(932);
				namespace();
				}
				break;
			case 51:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(933);
				match(SHOW);
				setState(934);
				match(CATALOGS);
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(935);
						match(LIKE);
						}
						break;
					}
					setState(938);
					((ShowCatalogsContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 52:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(941);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(942);
				match(FUNCTION);
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(943);
					match(EXTENDED);
					}
					break;
				}
				setState(946);
				describeFuncName();
				}
				break;
			case 53:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(947);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(948);
				namespace();
				setState(950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(949);
					match(EXTENDED);
					}
					break;
				}
				setState(952);
				multipartIdentifier();
				}
				break;
			case 54:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(954);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(955);
					match(TABLE);
					}
					break;
				}
				setState(959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(958);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(961);
				multipartIdentifier();
				setState(963);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(962);
					partitionSpec();
					}
					break;
				}
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(965);
					describeColName();
					}
					break;
				}
				}
				break;
			case 55:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(968);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(969);
					match(QUERY);
					}
				}

				setState(972);
				query();
				}
				break;
			case 56:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(973);
				match(COMMENT);
				setState(974);
				match(ON);
				setState(975);
				namespace();
				setState(976);
				multipartIdentifier();
				setState(977);
				match(IS);
				setState(978);
				comment();
				}
				break;
			case 57:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(980);
				match(COMMENT);
				setState(981);
				match(ON);
				setState(982);
				match(TABLE);
				setState(983);
				multipartIdentifier();
				setState(984);
				match(IS);
				setState(985);
				comment();
				}
				break;
			case 58:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(987);
				match(REFRESH);
				setState(988);
				match(TABLE);
				setState(989);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(990);
				match(REFRESH);
				setState(991);
				match(FUNCTION);
				setState(992);
				multipartIdentifier();
				}
				break;
			case 60:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(993);
				match(REFRESH);
				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(994);
					stringLit();
					}
					break;
				case 2:
					{
					setState(998);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(995);
							matchWildcard();
							}
							} 
						}
						setState(1000);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 61:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(1003);
				match(CACHE);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(1004);
					match(LAZY);
					}
				}

				setState(1007);
				match(TABLE);
				setState(1008);
				multipartIdentifier();
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1009);
					match(OPTIONS);
					setState(1010);
					((CacheTableContext)_localctx).options = propertyList();
					}
				}

				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & 281474985099265L) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1013);
						match(AS);
						}
					}

					setState(1016);
					query();
					}
				}

				}
				break;
			case 62:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(1019);
				match(UNCACHE);
				setState(1020);
				match(TABLE);
				setState(1023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1021);
					match(IF);
					setState(1022);
					match(EXISTS);
					}
					break;
				}
				setState(1025);
				multipartIdentifier();
				}
				break;
			case 63:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(1026);
				match(CLEAR);
				setState(1027);
				match(CACHE);
				}
				break;
			case 64:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(1028);
				match(LOAD);
				setState(1029);
				match(DATA);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1030);
					match(LOCAL);
					}
				}

				setState(1033);
				match(INPATH);
				setState(1034);
				((LoadDataContext)_localctx).path = stringLit();
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(1035);
					match(OVERWRITE);
					}
				}

				setState(1038);
				match(INTO);
				setState(1039);
				match(TABLE);
				setState(1040);
				multipartIdentifier();
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1041);
					partitionSpec();
					}
				}

				}
				break;
			case 65:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(1044);
				match(TRUNCATE);
				setState(1045);
				match(TABLE);
				setState(1046);
				multipartIdentifier();
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1047);
					partitionSpec();
					}
				}

				}
				break;
			case 66:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MSCK) {
					{
					setState(1050);
					match(MSCK);
					}
				}

				setState(1053);
				match(REPAIR);
				setState(1054);
				match(TABLE);
				setState(1055);
				multipartIdentifier();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(1056);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1057);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 67:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1060);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1061);
				identifier();
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1062);
						matchWildcard();
						}
						} 
					}
					setState(1067);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1068);
				match(SET);
				setState(1069);
				match(ROLE);
				setState(1073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1070);
						matchWildcard();
						}
						} 
					}
					setState(1075);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 69:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1076);
				match(SET);
				setState(1077);
				match(TIME);
				setState(1078);
				match(ZONE);
				setState(1079);
				interval();
				}
				break;
			case 70:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1080);
				match(SET);
				setState(1081);
				match(TIME);
				setState(1082);
				match(ZONE);
				setState(1083);
				timezone();
				}
				break;
			case 71:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1084);
				match(SET);
				setState(1085);
				match(TIME);
				setState(1086);
				match(ZONE);
				setState(1090);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1087);
						matchWildcard();
						}
						} 
					}
					setState(1092);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 72:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1093);
				match(SET);
				setState(1094);
				configKey();
				setState(1095);
				match(EQ);
				setState(1096);
				configValue();
				}
				break;
			case 73:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1098);
				match(SET);
				setState(1099);
				configKey();
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1100);
					match(EQ);
					setState(1104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1101);
							matchWildcard();
							}
							} 
						}
						setState(1106);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					}
					}
				}

				}
				break;
			case 74:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1109);
				match(SET);
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1110);
						matchWildcard();
						}
						} 
					}
					setState(1115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				setState(1116);
				match(EQ);
				setState(1117);
				configValue();
				}
				break;
			case 75:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1118);
				match(SET);
				setState(1122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1119);
						matchWildcard();
						}
						} 
					}
					setState(1124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				break;
			case 76:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1125);
				match(RESET);
				setState(1126);
				configKey();
				}
				break;
			case 77:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1127);
				match(RESET);
				setState(1131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1128);
						matchWildcard();
						}
						} 
					}
					setState(1133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case 78:
				_localctx = new CreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1134);
				match(CREATE);
				setState(1135);
				match(INDEX);
				setState(1139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1136);
					match(IF);
					setState(1137);
					match(NOT);
					setState(1138);
					match(EXISTS);
					}
					break;
				}
				setState(1141);
				identifier();
				setState(1142);
				match(ON);
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1143);
					match(TABLE);
					}
					break;
				}
				setState(1146);
				multipartIdentifier();
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1147);
					match(USING);
					setState(1148);
					((CreateIndexContext)_localctx).indexType = identifier();
					}
				}

				setState(1151);
				match(LEFT_PAREN);
				setState(1152);
				((CreateIndexContext)_localctx).columns = multipartIdentifierPropertyList();
				setState(1153);
				match(RIGHT_PAREN);
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1154);
					match(OPTIONS);
					setState(1155);
					((CreateIndexContext)_localctx).options = propertyList();
					}
				}

				}
				break;
			case 79:
				_localctx = new DropIndexContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1158);
				match(DROP);
				setState(1159);
				match(INDEX);
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1160);
					match(IF);
					setState(1161);
					match(EXISTS);
					}
					break;
				}
				setState(1164);
				identifier();
				setState(1165);
				match(ON);
				setState(1167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1166);
					match(TABLE);
					}
					break;
				}
				setState(1169);
				multipartIdentifier();
				}
				break;
			case 80:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1171);
				unsupportedHiveNativeCommands();
				setState(1175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1172);
						matchWildcard();
						}
						} 
					}
					setState(1177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimezoneContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TimezoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timezone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimezone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimezone(this);
		}
	}

	public final TimezoneContext timezone() throws RecognitionException {
		TimezoneContext _localctx = new TimezoneContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timezone);
		try {
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(LOCAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConfigKey(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigValueContext extends ParserRuleContext {
		public BackQuotedIdentifierContext backQuotedIdentifier() {
			return getRuleContext(BackQuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConfigValue(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			backQuotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1193);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1197);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1204);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1208);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1211);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1212);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1214);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1217);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1220);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1223);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1226);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1228);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1229);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1232);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1233);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1234);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1236);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1237);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1238);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1239);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1240);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1241);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1242);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1243);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1244);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1245);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1246);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1247);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1248);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1249);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1250);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1251);
				tableIdentifier();
				setState(1252);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1253);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1255);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1256);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1257);
				tableIdentifier();
				setState(1258);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1259);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1261);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1262);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1263);
				tableIdentifier();
				setState(1264);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1265);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1267);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1268);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1269);
				tableIdentifier();
				setState(1270);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1271);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1273);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1274);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1275);
				tableIdentifier();
				setState(1276);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1277);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1279);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1280);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1281);
				tableIdentifier();
				setState(1282);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1283);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1284);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1285);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1287);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1288);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1289);
				tableIdentifier();
				setState(1290);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1291);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1292);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1294);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1295);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1296);
				tableIdentifier();
				setState(1297);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1298);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1300);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1301);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1302);
				tableIdentifier();
				setState(1303);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1304);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1306);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1307);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1308);
				tableIdentifier();
				setState(1309);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1310);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1312);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1313);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1314);
				tableIdentifier();
				setState(1315);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1317);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1318);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1319);
				tableIdentifier();
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1320);
					partitionSpec();
					}
				}

				setState(1323);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1325);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1326);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1327);
				tableIdentifier();
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1328);
					partitionSpec();
					}
				}

				setState(1331);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1333);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1334);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1335);
				tableIdentifier();
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1336);
					partitionSpec();
					}
				}

				setState(1339);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1340);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1342);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1343);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1344);
				tableIdentifier();
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1345);
					partitionSpec();
					}
				}

				setState(1348);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1349);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1351);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1352);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1353);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1354);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1355);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableHeader(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(CREATE);
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1359);
				match(TEMPORARY);
				}
			}

			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1362);
				match(EXTERNAL);
				}
			}

			setState(1365);
			match(TABLE);
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1366);
				match(IF);
				setState(1367);
				match(NOT);
				setState(1368);
				match(EXISTS);
				}
				break;
			}
			setState(1371);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitReplaceTableHeader(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1373);
				match(CREATE);
				setState(1374);
				match(OR);
				}
			}

			setState(1377);
			match(REPLACE);
			setState(1378);
			match(TABLE);
			setState(1379);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBucketSpec(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(CLUSTERED);
			setState(1382);
			match(BY);
			setState(1383);
			identifierList();
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1384);
				match(SORTED);
				setState(1385);
				match(BY);
				setState(1386);
				orderedIdentifierList();
				}
			}

			setState(1389);
			match(INTO);
			setState(1390);
			match(INTEGER_VALUE);
			setState(1391);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSkewSpec(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(SKEWED);
			setState(1394);
			match(BY);
			setState(1395);
			identifierList();
			setState(1396);
			match(ON);
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1397);
				constantList();
				}
				break;
			case 2:
				{
				setState(1398);
				nestedConstantList();
				}
				break;
			}
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1401);
				match(STORED);
				setState(1402);
				match(AS);
				setState(1403);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLocationSpec(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(LOCATION);
			setState(1407);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentSpec(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(COMMENT);
			setState(1410);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1412);
				ctes();
				}
			}

			setState(1415);
			queryTerm(0);
			setState(1416);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoReplaceWhereContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public InsertIntoReplaceWhereContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertIntoReplaceWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertIntoReplaceWhere(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public StringLitContext path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteHiveDir(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public StringLitContext path;
		public PropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteDir(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertIntoTable(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_insertInto);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				match(INSERT);
				setState(1419);
				match(OVERWRITE);
				setState(1421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1420);
					match(TABLE);
					}
					break;
				}
				setState(1423);
				multipartIdentifier();
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1424);
					partitionSpec();
					setState(1428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1425);
						match(IF);
						setState(1426);
						match(NOT);
						setState(1427);
						match(EXISTS);
						}
					}

					}
				}

				setState(1433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1432);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(INSERT);
				setState(1436);
				match(INTO);
				setState(1438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1437);
					match(TABLE);
					}
					break;
				}
				setState(1440);
				multipartIdentifier();
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1441);
					partitionSpec();
					}
				}

				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1444);
					match(IF);
					setState(1445);
					match(NOT);
					setState(1446);
					match(EXISTS);
					}
				}

				setState(1450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1449);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertIntoReplaceWhereContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1452);
				match(INSERT);
				setState(1453);
				match(INTO);
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1454);
					match(TABLE);
					}
					break;
				}
				setState(1457);
				multipartIdentifier();
				setState(1458);
				match(REPLACE);
				setState(1459);
				whereClause();
				}
				break;
			case 4:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1461);
				match(INSERT);
				setState(1462);
				match(OVERWRITE);
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1463);
					match(LOCAL);
					}
				}

				setState(1466);
				match(DIRECTORY);
				setState(1467);
				((InsertOverwriteHiveDirContext)_localctx).path = stringLit();
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1468);
					rowFormat();
					}
				}

				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1471);
					createFileFormat();
					}
				}

				}
				break;
			case 5:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1474);
				match(INSERT);
				setState(1475);
				match(OVERWRITE);
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1476);
					match(LOCAL);
					}
				}

				setState(1479);
				match(DIRECTORY);
				setState(1481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1480);
					((InsertOverwriteDirContext)_localctx).path = stringLit();
					}
					break;
				}
				setState(1483);
				tableProvider();
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1484);
					match(OPTIONS);
					setState(1485);
					((InsertOverwriteDirContext)_localctx).options = propertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionSpecLocation(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			partitionSpec();
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1491);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionSpec(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(PARTITION);
			setState(1495);
			match(LEFT_PAREN);
			setState(1496);
			partitionVal();
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1497);
				match(COMMA);
				setState(1498);
				partitionVal();
				}
				}
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1504);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionVal(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_partitionVal);
		int _la;
		try {
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				identifier();
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1507);
					match(EQ);
					setState(1508);
					constant();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				identifier();
				setState(1512);
				match(EQ);
				setState(1513);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespacesContext extends ParserRuleContext {
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public NamespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamespaces(this);
		}
	}

	public final NamespacesContext namespaces() throws RecognitionException {
		NamespacesContext _localctx = new NamespacesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			_la = _input.LA(1);
			if ( !(_la==DATABASES || _la==NAMESPACES || _la==SCHEMAS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeFuncName(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_describeFuncName);
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				stringLit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1524);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1525);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeColName(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1529);
				match(DOT);
				setState(1530);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCtes(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(WITH);
			setState(1537);
			namedQuery();
			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1538);
				match(COMMA);
				setState(1539);
				namedQuery();
				}
				}
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedQuery(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1546);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1549);
				match(AS);
				}
			}

			setState(1552);
			match(LEFT_PAREN);
			setState(1553);
			query();
			setState(1554);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableProvider(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(USING);
			setState(1557);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableClausesContext extends ParserRuleContext {
		public PropertyListContext options;
		public PartitionFieldListContext partitioning;
		public PropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableClauses(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 4400193994753L) != 0) || ((((_la - 227)) & ~0x3f) == 0 && ((1L << (_la - 227)) & 34368192513L) != 0)) {
				{
				setState(1572);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1559);
					match(OPTIONS);
					setState(1560);
					((CreateTableClausesContext)_localctx).options = propertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1561);
					match(PARTITIONED);
					setState(1562);
					match(BY);
					setState(1563);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1564);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1565);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1566);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1567);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1568);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1569);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1570);
					match(TBLPROPERTIES);
					setState(1571);
					((CreateTableClausesContext)_localctx).tableProps = propertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyList(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(LEFT_PAREN);
			setState(1578);
			property();
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1579);
				match(COMMA);
				setState(1580);
				property();
				}
				}
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1586);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			((PropertyContext)_localctx).key = propertyKey();
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1589);
					match(EQ);
					}
					break;
				}
				setState(1592);
				((PropertyContext)_localctx).value = propertyValue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyKey(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyKey);
		try {
			int _alt;
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1595);
				identifier();
				setState(1600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1596);
						match(DOT);
						setState(1597);
						identifier();
						}
						} 
					}
					setState(1602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				stringLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyValue(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyValue);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				booleanValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1609);
				stringLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConstantList(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(LEFT_PAREN);
			setState(1613);
			constant();
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1614);
				match(COMMA);
				setState(1615);
				constant();
				}
				}
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1621);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNestedConstantList(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(LEFT_PAREN);
			setState(1624);
			constantList();
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1625);
				match(COMMA);
				setState(1626);
				constantList();
				}
				}
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1632);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateFileFormat(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_createFileFormat);
		try {
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				match(STORED);
				setState(1635);
				match(AS);
				setState(1636);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1637);
				match(STORED);
				setState(1638);
				match(BY);
				setState(1639);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableFileFormatContext extends FileFormatContext {
		public StringLitContext inFmt;
		public StringLitContext outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableFileFormat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGenericFileFormat(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fileFormat);
		try {
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				match(INPUTFORMAT);
				setState(1643);
				((TableFileFormatContext)_localctx).inFmt = stringLit();
				setState(1644);
				match(OUTPUTFORMAT);
				setState(1645);
				((TableFileFormatContext)_localctx).outFmt = stringLit();
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageHandlerContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStorageHandler(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			stringLit();
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1651);
				match(WITH);
				setState(1652);
				match(SERDEPROPERTIES);
				setState(1653);
				propertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			identifier();
			setState(1657);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDeleteFromTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleInsertQuery(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiInsertQuery(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUpdateTable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public List<NotMatchedBySourceClauseContext> notMatchedBySourceClause() {
			return getRuleContexts(NotMatchedBySourceClauseContext.class);
		}
		public NotMatchedBySourceClauseContext notMatchedBySourceClause(int i) {
			return getRuleContext(NotMatchedBySourceClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMergeIntoTable(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				insertInto();
				setState(1660);
				query();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				fromClause();
				setState(1664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1663);
					multiInsertQueryBody();
					}
					}
					setState(1666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				match(DELETE);
				setState(1669);
				match(FROM);
				setState(1670);
				multipartIdentifier();
				setState(1671);
				tableAlias();
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1672);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1675);
				match(UPDATE);
				setState(1676);
				multipartIdentifier();
				setState(1677);
				tableAlias();
				setState(1678);
				setClause();
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1679);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1682);
				match(MERGE);
				setState(1683);
				match(INTO);
				setState(1684);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1685);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1686);
				match(USING);
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1687);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1688);
					match(LEFT_PAREN);
					setState(1689);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1690);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(1694);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1695);
				match(ON);
				setState(1696);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1697);
						matchedClause();
						}
						} 
					}
					setState(1702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				setState(1706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1703);
						notMatchedClause();
						}
						} 
					}
					setState(1708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1709);
					notMatchedBySourceClause();
					}
					}
					setState(1714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public ExpressionContext offset;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryOrganization(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1717);
				match(ORDER);
				setState(1718);
				match(BY);
				setState(1719);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1720);
						match(COMMA);
						setState(1721);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1726);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				}
				break;
			}
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1729);
				match(CLUSTER);
				setState(1730);
				match(BY);
				setState(1731);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1732);
						match(COMMA);
						setState(1733);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1738);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
				break;
			}
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1741);
				match(DISTRIBUTE);
				setState(1742);
				match(BY);
				setState(1743);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1744);
						match(COMMA);
						setState(1745);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			}
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1753);
				match(SORT);
				setState(1754);
				match(BY);
				setState(1755);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1756);
						match(COMMA);
						setState(1757);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1762);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				}
				break;
			}
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1765);
				windowClause();
				}
				break;
			}
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1768);
				match(LIMIT);
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1769);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1770);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1775);
				match(OFFSET);
				setState(1776);
				((QueryOrganizationContext)_localctx).offset = expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiInsertQueryBody(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			insertInto();
			setState(1780);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryTermDefault(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetOperation(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1783);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1806);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1785);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1786);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1787);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1789);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1788);
							setQuantifier();
							}
						}

						setState(1791);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1792);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1793);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1794);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1796);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1795);
							setQuantifier();
							}
						}

						setState(1798);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1799);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1800);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1801);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1803);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1802);
							setQuantifier();
							}
						}

						setState(1805);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends QueryPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubquery(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryPrimaryDefault(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTableDefault1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTable(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_queryPrimary);
		try {
			setState(1820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1813);
				match(TABLE);
				setState(1814);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1815);
				inlineTable();
				}
				break;
			case LEFT_PAREN:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1816);
				match(LEFT_PAREN);
				setState(1817);
				query();
				setState(1818);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSortItem(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			expression();
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1823);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1826);
				match(NULLS);
				setState(1827);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStatement(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			fromClause();
			setState(1832); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1831);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1834); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStatementBody(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				transformClause();
				setState(1838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1837);
					whereClause();
					}
					break;
				}
				setState(1840);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				selectClause();
				setState(1846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1843);
						lateralView();
						}
						} 
					}
					setState(1848);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1849);
					whereClause();
					}
					break;
				}
				setState(1853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1852);
					aggregationClause();
					}
					break;
				}
				setState(1856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1855);
					havingClause();
					}
					break;
				}
				setState(1859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1858);
					windowClause();
					}
					break;
				}
				setState(1861);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRegularQuerySpecification(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformQuerySpecification(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_querySpecification);
		try {
			int _alt;
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1865);
				transformClause();
				setState(1867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1866);
					fromClause();
					}
					break;
				}
				setState(1872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1869);
						lateralView();
						}
						} 
					}
					setState(1874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				setState(1876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1875);
					whereClause();
					}
					break;
				}
				setState(1879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1878);
					aggregationClause();
					}
					break;
				}
				setState(1882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1881);
					havingClause();
					}
					break;
				}
				setState(1885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1884);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1887);
				selectClause();
				setState(1889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1888);
					fromClause();
					}
					break;
				}
				setState(1894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1891);
						lateralView();
						}
						} 
					}
					setState(1896);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				}
				setState(1898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1897);
					whereClause();
					}
					break;
				}
				setState(1901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1900);
					aggregationClause();
					}
					break;
				}
				setState(1904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1903);
					havingClause();
					}
					break;
				}
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1906);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public StringLitContext recordWriter;
		public StringLitContext script;
		public RowFormatContext outRowFormat;
		public StringLitContext recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformClause(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1911);
				match(SELECT);
				setState(1912);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1913);
				match(LEFT_PAREN);
				setState(1915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1914);
					setQuantifier();
					}
					break;
				}
				setState(1917);
				expressionSeq();
				setState(1918);
				match(RIGHT_PAREN);
				}
				break;
			case MAP:
				{
				setState(1920);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1921);
					setQuantifier();
					}
					break;
				}
				setState(1924);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1925);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1926);
					setQuantifier();
					}
					break;
				}
				setState(1929);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1932);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1935);
				match(RECORDWRITER);
				setState(1936);
				((TransformClauseContext)_localctx).recordWriter = stringLit();
				}
			}

			setState(1939);
			match(USING);
			setState(1940);
			((TransformClauseContext)_localctx).script = stringLit();
			setState(1953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1941);
				match(AS);
				setState(1951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1942);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1943);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1944);
					match(LEFT_PAREN);
					setState(1947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						setState(1945);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1946);
						colTypeList();
						}
						break;
					}
					setState(1949);
					match(RIGHT_PAREN);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1955);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1958);
				match(RECORDREADER);
				setState(1959);
				((TransformClauseContext)_localctx).recordReader = stringLit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSelectClause(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(SELECT);
			setState(1966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1963);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1969);
				setQuantifier();
				}
				break;
			}
			setState(1972);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetClause(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			match(SET);
			setState(1975);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMatchedClause(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(WHEN);
			setState(1978);
			match(MATCHED);
			setState(1981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1979);
				match(AND);
				setState(1980);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1983);
			match(THEN);
			setState(1984);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedClause(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(WHEN);
			setState(1987);
			match(NOT);
			setState(1988);
			match(MATCHED);
			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1989);
				match(BY);
				setState(1990);
				match(TARGET);
				}
			}

			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1993);
				match(AND);
				setState(1994);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1997);
			match(THEN);
			setState(1998);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedBySourceClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedBySourceCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedBySourceActionContext notMatchedBySourceAction() {
			return getRuleContext(NotMatchedBySourceActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedBySourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedBySourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedBySourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedBySourceClause(this);
		}
	}

	public final NotMatchedBySourceClauseContext notMatchedBySourceClause() throws RecognitionException {
		NotMatchedBySourceClauseContext _localctx = new NotMatchedBySourceClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_notMatchedBySourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(WHEN);
			setState(2001);
			match(NOT);
			setState(2002);
			match(MATCHED);
			setState(2003);
			match(BY);
			setState(2004);
			match(SOURCE);
			setState(2007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2005);
				match(AND);
				setState(2006);
				((NotMatchedBySourceClauseContext)_localctx).notMatchedBySourceCond = booleanExpression(0);
				}
			}

			setState(2009);
			match(THEN);
			setState(2010);
			notMatchedBySourceAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMatchedAction(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_matchedAction);
		try {
			setState(2019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				match(UPDATE);
				setState(2014);
				match(SET);
				setState(2015);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2016);
				match(UPDATE);
				setState(2017);
				match(SET);
				setState(2018);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedAction(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_notMatchedAction);
		int _la;
		try {
			setState(2039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2021);
				match(INSERT);
				setState(2022);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2023);
				match(INSERT);
				setState(2024);
				match(LEFT_PAREN);
				setState(2025);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(2026);
				match(RIGHT_PAREN);
				setState(2027);
				match(VALUES);
				setState(2028);
				match(LEFT_PAREN);
				setState(2029);
				expression();
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2030);
					match(COMMA);
					setState(2031);
					expression();
					}
					}
					setState(2036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2037);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedBySourceActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public NotMatchedBySourceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedBySourceAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedBySourceAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedBySourceAction(this);
		}
	}

	public final NotMatchedBySourceActionContext notMatchedBySourceAction() throws RecognitionException {
		NotMatchedBySourceActionContext _localctx = new NotMatchedBySourceActionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_notMatchedBySourceAction);
		try {
			setState(2045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2041);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				match(UPDATE);
				setState(2043);
				match(SET);
				setState(2044);
				assignmentList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAssignmentList(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			assignment();
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2048);
				match(COMMA);
				setState(2049);
				assignment();
				}
				}
				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(2056);
			match(EQ);
			setState(2057);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			match(WHERE);
			setState(2060);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHavingClause(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			match(HAVING);
			setState(2063);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public TerminalNode HENT_START() { return getToken(SqlBaseParser.HENT_START, 0); }
		public TerminalNode HENT_END() { return getToken(SqlBaseParser.HENT_END, 0); }
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHint(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			match(HENT_START);
			setState(2066);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(2073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2068);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
					case 1:
						{
						setState(2067);
						match(COMMA);
						}
						break;
					}
					setState(2070);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(2075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			setState(2076);
			match(HENT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHintStatement(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_hintStatement);
		int _la;
		try {
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2078);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2079);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(2080);
				match(LEFT_PAREN);
				setState(2081);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2082);
					match(COMMA);
					setState(2083);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(2088);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2089);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public UnpivotClauseContext unpivotClause() {
			return getRuleContext(UnpivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(FROM);
			setState(2094);
			relation();
			setState(2099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2095);
					match(COMMA);
					setState(2096);
					relation();
					}
					} 
				}
				setState(2101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			setState(2105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2102);
					lateralView();
					}
					} 
				}
				setState(2107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			setState(2109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2108);
				pivotClause();
				}
				break;
			}
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2111);
				unpivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemporalClauseContext extends ParserRuleContext {
		public ValueExpressionContext timestamp;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TemporalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTemporalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTemporalClause(this);
		}
	}

	public final TemporalClauseContext temporalClause() throws RecognitionException {
		TemporalClauseContext _localctx = new TemporalClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_temporalClause);
		int _la;
		try {
			setState(2128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2114);
					match(FOR);
					}
				}

				setState(2117);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_VERSION || _la==VERSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2118);
				match(AS);
				setState(2119);
				match(OF);
				setState(2120);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2121);
					match(FOR);
					}
				}

				setState(2124);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_TIME || _la==TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2125);
				match(AS);
				setState(2126);
				match(OF);
				setState(2127);
				((TemporalClauseContext)_localctx).timestamp = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAggregationClause(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2130);
				match(GROUP);
				setState(2131);
				match(BY);
				setState(2132);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(2137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2133);
						match(COMMA);
						setState(2134);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(2139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2140);
				match(GROUP);
				setState(2141);
				match(BY);
				setState(2142);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(2147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2143);
						match(COMMA);
						setState(2144);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(2149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				}
				setState(2167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2150);
					match(WITH);
					setState(2151);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(2152);
					match(WITH);
					setState(2153);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(2154);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(2155);
					match(SETS);
					setState(2156);
					match(LEFT_PAREN);
					setState(2157);
					groupingSet();
					setState(2162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2158);
						match(COMMA);
						setState(2159);
						groupingSet();
						}
						}
						setState(2164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2165);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupByClause(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_groupByClause);
		try {
			setState(2173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingAnalytics(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_groupingAnalytics);
		int _la;
		try {
			setState(2200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2176);
				match(LEFT_PAREN);
				setState(2177);
				groupingSet();
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2178);
					match(COMMA);
					setState(2179);
					groupingSet();
					}
					}
					setState(2184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2185);
				match(RIGHT_PAREN);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				match(GROUPING);
				setState(2188);
				match(SETS);
				setState(2189);
				match(LEFT_PAREN);
				setState(2190);
				groupingElement();
				setState(2195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2191);
					match(COMMA);
					setState(2192);
					groupingElement();
					}
					}
					setState(2197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2198);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingElement(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_groupingElement);
		try {
			setState(2204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2202);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2203);
				groupingSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingSetContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingSet(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_groupingSet);
		int _la;
		try {
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206);
				match(LEFT_PAREN);
				setState(2215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2207);
					expression();
					setState(2212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2208);
						match(COMMA);
						setState(2209);
						expression();
						}
						}
						setState(2214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2217);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotClause(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			match(PIVOT);
			setState(2222);
			match(LEFT_PAREN);
			setState(2223);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2224);
			match(FOR);
			setState(2225);
			pivotColumn();
			setState(2226);
			match(IN);
			setState(2227);
			match(LEFT_PAREN);
			setState(2228);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2229);
				match(COMMA);
				setState(2230);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2236);
			match(RIGHT_PAREN);
			setState(2237);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotColumn(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_pivotColumn);
		int _la;
		try {
			setState(2251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2239);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2240);
				match(LEFT_PAREN);
				setState(2241);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2242);
					match(COMMA);
					setState(2243);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2249);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotValue(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			expression();
			setState(2258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2254);
					match(AS);
					}
					break;
				}
				setState(2257);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotClauseContext extends ParserRuleContext {
		public UnpivotNullClauseContext nullOperator;
		public UnpivotOperatorContext operator;
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public UnpivotOperatorContext unpivotOperator() {
			return getRuleContext(UnpivotOperatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotNullClauseContext unpivotNullClause() {
			return getRuleContext(UnpivotNullClauseContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public UnpivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotClause(this);
		}
	}

	public final UnpivotClauseContext unpivotClause() throws RecognitionException {
		UnpivotClauseContext _localctx = new UnpivotClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unpivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			match(UNPIVOT);
			setState(2262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE || _la==INCLUDE) {
				{
				setState(2261);
				((UnpivotClauseContext)_localctx).nullOperator = unpivotNullClause();
				}
			}

			setState(2264);
			match(LEFT_PAREN);
			setState(2265);
			((UnpivotClauseContext)_localctx).operator = unpivotOperator();
			setState(2266);
			match(RIGHT_PAREN);
			setState(2271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2267);
					match(AS);
					}
					break;
				}
				setState(2270);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotNullClauseContext extends ParserRuleContext {
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public UnpivotNullClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotNullClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotNullClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotNullClause(this);
		}
	}

	public final UnpivotNullClauseContext unpivotNullClause() throws RecognitionException {
		UnpivotNullClauseContext _localctx = new UnpivotNullClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unpivotNullClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDE || _la==INCLUDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2274);
			match(NULLS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotOperatorContext extends ParserRuleContext {
		public UnpivotSingleValueColumnClauseContext unpivotSingleValueColumnClause() {
			return getRuleContext(UnpivotSingleValueColumnClauseContext.class,0);
		}
		public UnpivotMultiValueColumnClauseContext unpivotMultiValueColumnClause() {
			return getRuleContext(UnpivotMultiValueColumnClauseContext.class,0);
		}
		public UnpivotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotOperator(this);
		}
	}

	public final UnpivotOperatorContext unpivotOperator() throws RecognitionException {
		UnpivotOperatorContext _localctx = new UnpivotOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_unpivotOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2276);
				unpivotSingleValueColumnClause();
				}
				break;
			case 2:
				{
				setState(2277);
				unpivotMultiValueColumnClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotSingleValueColumnClauseContext extends ParserRuleContext {
		public UnpivotColumnAndAliasContext unpivotColumnAndAlias;
		public List<UnpivotColumnAndAliasContext> unpivotColumns = new ArrayList<UnpivotColumnAndAliasContext>();
		public UnpivotValueColumnContext unpivotValueColumn() {
			return getRuleContext(UnpivotValueColumnContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public UnpivotNameColumnContext unpivotNameColumn() {
			return getRuleContext(UnpivotNameColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<UnpivotColumnAndAliasContext> unpivotColumnAndAlias() {
			return getRuleContexts(UnpivotColumnAndAliasContext.class);
		}
		public UnpivotColumnAndAliasContext unpivotColumnAndAlias(int i) {
			return getRuleContext(UnpivotColumnAndAliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotSingleValueColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotSingleValueColumnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotSingleValueColumnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotSingleValueColumnClause(this);
		}
	}

	public final UnpivotSingleValueColumnClauseContext unpivotSingleValueColumnClause() throws RecognitionException {
		UnpivotSingleValueColumnClauseContext _localctx = new UnpivotSingleValueColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unpivotSingleValueColumnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			unpivotValueColumn();
			setState(2281);
			match(FOR);
			setState(2282);
			unpivotNameColumn();
			setState(2283);
			match(IN);
			setState(2284);
			match(LEFT_PAREN);
			setState(2285);
			((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias = unpivotColumnAndAlias();
			((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumns.add(((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias);
			setState(2290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2286);
				match(COMMA);
				setState(2287);
				((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias = unpivotColumnAndAlias();
				((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumns.add(((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias);
				}
				}
				setState(2292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2293);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotMultiValueColumnClauseContext extends ParserRuleContext {
		public UnpivotValueColumnContext unpivotValueColumn;
		public List<UnpivotValueColumnContext> unpivotValueColumns = new ArrayList<UnpivotValueColumnContext>();
		public UnpivotColumnSetContext unpivotColumnSet;
		public List<UnpivotColumnSetContext> unpivotColumnSets = new ArrayList<UnpivotColumnSetContext>();
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public UnpivotNameColumnContext unpivotNameColumn() {
			return getRuleContext(UnpivotNameColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<UnpivotValueColumnContext> unpivotValueColumn() {
			return getRuleContexts(UnpivotValueColumnContext.class);
		}
		public UnpivotValueColumnContext unpivotValueColumn(int i) {
			return getRuleContext(UnpivotValueColumnContext.class,i);
		}
		public List<UnpivotColumnSetContext> unpivotColumnSet() {
			return getRuleContexts(UnpivotColumnSetContext.class);
		}
		public UnpivotColumnSetContext unpivotColumnSet(int i) {
			return getRuleContext(UnpivotColumnSetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotMultiValueColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotMultiValueColumnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotMultiValueColumnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotMultiValueColumnClause(this);
		}
	}

	public final UnpivotMultiValueColumnClauseContext unpivotMultiValueColumnClause() throws RecognitionException {
		UnpivotMultiValueColumnClauseContext _localctx = new UnpivotMultiValueColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_unpivotMultiValueColumnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			match(LEFT_PAREN);
			setState(2296);
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn = unpivotValueColumn();
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumns.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn);
			setState(2301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2297);
				match(COMMA);
				setState(2298);
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn = unpivotValueColumn();
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumns.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn);
				}
				}
				setState(2303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2304);
			match(RIGHT_PAREN);
			setState(2305);
			match(FOR);
			setState(2306);
			unpivotNameColumn();
			setState(2307);
			match(IN);
			setState(2308);
			match(LEFT_PAREN);
			setState(2309);
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet = unpivotColumnSet();
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSets.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet);
			setState(2314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2310);
				match(COMMA);
				setState(2311);
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet = unpivotColumnSet();
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSets.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet);
				}
				}
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2317);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotColumnSetContext extends ParserRuleContext {
		public UnpivotColumnContext unpivotColumn;
		public List<UnpivotColumnContext> unpivotColumns = new ArrayList<UnpivotColumnContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<UnpivotColumnContext> unpivotColumn() {
			return getRuleContexts(UnpivotColumnContext.class);
		}
		public UnpivotColumnContext unpivotColumn(int i) {
			return getRuleContext(UnpivotColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotAliasContext unpivotAlias() {
			return getRuleContext(UnpivotAliasContext.class,0);
		}
		public UnpivotColumnSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumnSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotColumnSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotColumnSet(this);
		}
	}

	public final UnpivotColumnSetContext unpivotColumnSet() throws RecognitionException {
		UnpivotColumnSetContext _localctx = new UnpivotColumnSetContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_unpivotColumnSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			match(LEFT_PAREN);
			setState(2320);
			((UnpivotColumnSetContext)_localctx).unpivotColumn = unpivotColumn();
			((UnpivotColumnSetContext)_localctx).unpivotColumns.add(((UnpivotColumnSetContext)_localctx).unpivotColumn);
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2321);
				match(COMMA);
				setState(2322);
				((UnpivotColumnSetContext)_localctx).unpivotColumn = unpivotColumn();
				((UnpivotColumnSetContext)_localctx).unpivotColumns.add(((UnpivotColumnSetContext)_localctx).unpivotColumn);
				}
				}
				setState(2327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2328);
			match(RIGHT_PAREN);
			setState(2330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2329);
				unpivotAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotValueColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotValueColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotValueColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotValueColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotValueColumn(this);
		}
	}

	public final UnpivotValueColumnContext unpivotValueColumn() throws RecognitionException {
		UnpivotValueColumnContext _localctx = new UnpivotValueColumnContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_unpivotValueColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotNameColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotNameColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotNameColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotNameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotNameColumn(this);
		}
	}

	public final UnpivotNameColumnContext unpivotNameColumn() throws RecognitionException {
		UnpivotNameColumnContext _localctx = new UnpivotNameColumnContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_unpivotNameColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotColumnAndAliasContext extends ParserRuleContext {
		public UnpivotColumnContext unpivotColumn() {
			return getRuleContext(UnpivotColumnContext.class,0);
		}
		public UnpivotAliasContext unpivotAlias() {
			return getRuleContext(UnpivotAliasContext.class,0);
		}
		public UnpivotColumnAndAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumnAndAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotColumnAndAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotColumnAndAlias(this);
		}
	}

	public final UnpivotColumnAndAliasContext unpivotColumnAndAlias() throws RecognitionException {
		UnpivotColumnAndAliasContext _localctx = new UnpivotColumnAndAliasContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unpivotColumnAndAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			unpivotColumn();
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2337);
				unpivotAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotColumnContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UnpivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotColumn(this);
		}
	}

	public final UnpivotColumnContext unpivotColumn() throws RecognitionException {
		UnpivotColumnContext _localctx = new UnpivotColumnContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unpivotColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public UnpivotAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotAlias(this);
		}
	}

	public final UnpivotAliasContext unpivotAlias() throws RecognitionException {
		UnpivotAliasContext _localctx = new UnpivotAliasContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_unpivotAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2342);
				match(AS);
				}
				break;
			}
			setState(2345);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLateralView(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(LATERAL);
			setState(2348);
			match(VIEW);
			setState(2350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2349);
				match(OUTER);
				}
				break;
			}
			setState(2352);
			qualifiedName();
			setState(2353);
			match(LEFT_PAREN);
			setState(2362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2354);
				expression();
				setState(2359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2355);
					match(COMMA);
					setState(2356);
					expression();
					}
					}
					setState(2361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2364);
			match(RIGHT_PAREN);
			setState(2365);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2366);
					match(AS);
					}
					break;
				}
				setState(2369);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2370);
						match(COMMA);
						setState(2371);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetQuantifier(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public List<RelationExtensionContext> relationExtension() {
			return getRuleContexts(RelationExtensionContext.class);
		}
		public RelationExtensionContext relationExtension(int i) {
			return getRuleContext(RelationExtensionContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2381);
				match(LATERAL);
				}
				break;
			}
			setState(2384);
			relationPrimary();
			setState(2388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2385);
					relationExtension();
					}
					} 
				}
				setState(2390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationExtensionContext extends ParserRuleContext {
		public JoinRelationContext joinRelation() {
			return getRuleContext(JoinRelationContext.class,0);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public UnpivotClauseContext unpivotClause() {
			return getRuleContext(UnpivotClauseContext.class,0);
		}
		public RelationExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRelationExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRelationExtension(this);
		}
	}

	public final RelationExtensionContext relationExtension() throws RecognitionException {
		RelationExtensionContext _localctx = new RelationExtensionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_relationExtension);
		try {
			setState(2394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case NATURAL:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(2391);
				joinRelation();
				}
				break;
			case PIVOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2392);
				pivotClause();
				}
				break;
			case UNPIVOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2393);
				unpivotClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinRelation(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_joinRelation);
		try {
			setState(2413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2396);
				joinType();
				}
				setState(2397);
				match(JOIN);
				setState(2399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2398);
					match(LATERAL);
					}
					break;
				}
				setState(2401);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2402);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(NATURAL);
				setState(2406);
				joinType();
				setState(2407);
				match(JOIN);
				setState(2409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2408);
					match(LATERAL);
					}
					break;
				}
				setState(2411);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinType(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_joinType);
		int _la;
		try {
			setState(2439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2415);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2418);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2419);
				match(LEFT);
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2420);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2423);
					match(LEFT);
					}
				}

				setState(2426);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2427);
				match(RIGHT);
				setState(2429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2428);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2431);
				match(FULL);
				setState(2433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2432);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2435);
					match(LEFT);
					}
				}

				setState(2438);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinCriteria(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_joinCriteria);
		try {
			setState(2445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2441);
				match(ON);
				setState(2442);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2443);
				match(USING);
				setState(2444);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SampleContext extends ParserRuleContext {
		public Token seed;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSample(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			match(TABLESAMPLE);
			setState(2448);
			match(LEFT_PAREN);
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2449);
				sampleMethod();
				}
				break;
			}
			setState(2452);
			match(RIGHT_PAREN);
			setState(2457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2453);
				match(REPEATABLE);
				setState(2454);
				match(LEFT_PAREN);
				setState(2455);
				((SampleContext)_localctx).seed = match(INTEGER_VALUE);
				setState(2456);
				match(RIGHT_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByRows(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByPercentile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByBucket(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByBytes(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_sampleMethod);
		int _la;
		try {
			setState(2483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2459);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2462);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2463);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2464);
				expression();
				setState(2465);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2468);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2469);
				match(OUT);
				setState(2470);
				match(OF);
				setState(2471);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2472);
					match(ON);
					setState(2478);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						setState(2473);
						identifier();
						}
						break;
					case 2:
						{
						setState(2474);
						qualifiedName();
						setState(2475);
						match(LEFT_PAREN);
						setState(2476);
						match(RIGHT_PAREN);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2482);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			match(LEFT_PAREN);
			setState(2486);
			identifierSeq();
			setState(2487);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierSeq(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2489);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2490);
					match(COMMA);
					setState(2491);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOrderedIdentifierList(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			match(LEFT_PAREN);
			setState(2498);
			orderedIdentifier();
			setState(2503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2499);
				match(COMMA);
				setState(2500);
				orderedIdentifier();
				}
				}
				setState(2505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2506);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOrderedIdentifier(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2509);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierCommentList(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			match(LEFT_PAREN);
			setState(2513);
			identifierComment();
			setState(2518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2514);
				match(COMMA);
				setState(2515);
				identifierComment();
				}
				}
				setState(2520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2521);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierComment(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2523);
			identifier();
			setState(2525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2524);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableValuedFunction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTableDefault2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAliasedRelation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAliasedQuery(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TemporalClauseContext temporalClause() {
			return getRuleContext(TemporalClauseContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableName(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_relationPrimary);
		try {
			setState(2554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2527);
				multipartIdentifier();
				setState(2529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2528);
					temporalClause();
					}
					break;
				}
				setState(2532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2531);
					sample();
					}
					break;
				}
				setState(2534);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2536);
				match(LEFT_PAREN);
				setState(2537);
				query();
				setState(2538);
				match(RIGHT_PAREN);
				setState(2540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2539);
					sample();
					}
					break;
				}
				setState(2542);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2544);
				match(LEFT_PAREN);
				setState(2545);
				relation();
				setState(2546);
				match(RIGHT_PAREN);
				setState(2548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2547);
					sample();
					}
					break;
				}
				setState(2550);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2552);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2553);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTable(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			match(VALUES);
			setState(2557);
			expression();
			setState(2562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2558);
					match(COMMA);
					setState(2559);
					expression();
					}
					} 
				}
				setState(2564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			setState(2565);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionTable(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2568);
			match(LEFT_PAREN);
			setState(2577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2569);
				expression();
				setState(2574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2570);
					match(COMMA);
					setState(2571);
					expression();
					}
					}
					setState(2576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2579);
			match(RIGHT_PAREN);
			setState(2580);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableAlias(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2582);
					match(AS);
					}
					break;
				}
				setState(2585);
				strictIdentifier();
				setState(2587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2586);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatSerdeContext extends RowFormatContext {
		public StringLitContext name;
		public PropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowFormatSerde(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public StringLitContext fieldsTerminatedBy;
		public StringLitContext escapedBy;
		public StringLitContext collectionItemsTerminatedBy;
		public StringLitContext keysTerminatedBy;
		public StringLitContext linesSeparatedBy;
		public StringLitContext nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowFormatDelimited(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_rowFormat);
		try {
			setState(2640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2591);
				match(ROW);
				setState(2592);
				match(FORMAT);
				setState(2593);
				match(SERDE);
				setState(2594);
				((RowFormatSerdeContext)_localctx).name = stringLit();
				setState(2598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2595);
					match(WITH);
					setState(2596);
					match(SERDEPROPERTIES);
					setState(2597);
					((RowFormatSerdeContext)_localctx).props = propertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2600);
				match(ROW);
				setState(2601);
				match(FORMAT);
				setState(2602);
				match(DELIMITED);
				setState(2612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2603);
					match(FIELDS);
					setState(2604);
					match(TERMINATED);
					setState(2605);
					match(BY);
					setState(2606);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = stringLit();
					setState(2610);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
					case 1:
						{
						setState(2607);
						match(ESCAPED);
						setState(2608);
						match(BY);
						setState(2609);
						((RowFormatDelimitedContext)_localctx).escapedBy = stringLit();
						}
						break;
					}
					}
					break;
				}
				setState(2619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2614);
					match(COLLECTION);
					setState(2615);
					match(ITEMS);
					setState(2616);
					match(TERMINATED);
					setState(2617);
					match(BY);
					setState(2618);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = stringLit();
					}
					break;
				}
				setState(2626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(2621);
					match(MAP);
					setState(2622);
					match(KEYS);
					setState(2623);
					match(TERMINATED);
					setState(2624);
					match(BY);
					setState(2625);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = stringLit();
					}
					break;
				}
				setState(2632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2628);
					match(LINES);
					setState(2629);
					match(TERMINATED);
					setState(2630);
					match(BY);
					setState(2631);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = stringLit();
					}
					break;
				}
				setState(2638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2634);
					match(NULL);
					setState(2635);
					match(DEFINED);
					setState(2636);
					match(AS);
					setState(2637);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = stringLit();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierList(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2642);
			multipartIdentifier();
			setState(2647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2643);
				match(COMMA);
				setState(2644);
				multipartIdentifier();
				}
				}
				setState(2649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifier(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2650);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2651);
					match(DOT);
					setState(2652);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierPropertyListContext extends ParserRuleContext {
		public List<MultipartIdentifierPropertyContext> multipartIdentifierProperty() {
			return getRuleContexts(MultipartIdentifierPropertyContext.class);
		}
		public MultipartIdentifierPropertyContext multipartIdentifierProperty(int i) {
			return getRuleContext(MultipartIdentifierPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierPropertyList(this);
		}
	}

	public final MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() throws RecognitionException {
		MultipartIdentifierPropertyListContext _localctx = new MultipartIdentifierPropertyListContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_multipartIdentifierPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			multipartIdentifierProperty();
			setState(2663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2659);
				match(COMMA);
				setState(2660);
				multipartIdentifierProperty();
				}
				}
				setState(2665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierPropertyContext extends ParserRuleContext {
		public PropertyListContext options;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MultipartIdentifierPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierProperty(this);
		}
	}

	public final MultipartIdentifierPropertyContext multipartIdentifierProperty() throws RecognitionException {
		MultipartIdentifierPropertyContext _localctx = new MultipartIdentifierPropertyContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_multipartIdentifierProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			multipartIdentifier();
			setState(2669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(2667);
				match(OPTIONS);
				setState(2668);
				((MultipartIdentifierPropertyContext)_localctx).options = propertyList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableIdentifier(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2671);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2672);
				match(DOT);
				}
				break;
			}
			setState(2676);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionIdentifier(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2678);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2679);
				match(DOT);
				}
				break;
			}
			setState(2683);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedExpression(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2685);
			expression();
			setState(2693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2686);
					match(AS);
					}
					break;
				}
				setState(2691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
				case 1:
					{
					setState(2689);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2690);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedExpressionSeq(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			namedExpression();
			setState(2700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2696);
					match(COMMA);
					setState(2697);
					namedExpression();
					}
					} 
				}
				setState(2702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionFieldList(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			match(LEFT_PAREN);
			setState(2704);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2705);
				match(COMMA);
				setState(2706);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2712);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionColumn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionTransform(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_partitionField);
		try {
			setState(2716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2714);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2715);
				colType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentityTransform(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitApplyTransform(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_transform);
		int _la;
		try {
			setState(2731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2718);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2719);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2720);
				match(LEFT_PAREN);
				setState(2721);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2722);
					match(COMMA);
					setState(2723);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2729);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformArgument(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_transformArgument);
		try {
			setState(2735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2733);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2734);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExpressionSeq(this);
		}
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2739);
			expression();
			setState(2744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2740);
				match(COMMA);
				setState(2741);
				expression();
				}
				}
				setState(2746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLogicalNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicated(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExists(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLogicalBinary(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2748);
				match(NOT);
				setState(2749);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2750);
				match(EXISTS);
				setState(2751);
				match(LEFT_PAREN);
				setState(2752);
				query();
				setState(2753);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2755);
				valueExpression(0);
				setState(2757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
				case 1:
					{
					setState(2756);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2767);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2761);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2762);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2763);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2764);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2765);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2766);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public StringLitContext escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_predicate);
		int _la;
		try {
			setState(2854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2772);
					match(NOT);
					}
				}

				setState(2775);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2776);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2777);
				match(AND);
				setState(2778);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2780);
					match(NOT);
					}
				}

				setState(2783);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2784);
				match(LEFT_PAREN);
				setState(2785);
				expression();
				setState(2790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2786);
					match(COMMA);
					setState(2787);
					expression();
					}
					}
					setState(2792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2793);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2795);
					match(NOT);
					}
				}

				setState(2798);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2799);
				match(LEFT_PAREN);
				setState(2800);
				query();
				setState(2801);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2803);
					match(NOT);
					}
				}

				setState(2806);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2807);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2808);
					match(NOT);
					}
				}

				setState(2811);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2812);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2813);
					match(LEFT_PAREN);
					setState(2814);
					match(RIGHT_PAREN);
					}
					break;
				case 2:
					{
					setState(2815);
					match(LEFT_PAREN);
					setState(2816);
					expression();
					setState(2821);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2817);
						match(COMMA);
						setState(2818);
						expression();
						}
						}
						setState(2823);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2824);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2828);
					match(NOT);
					}
				}

				setState(2831);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2832);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
				case 1:
					{
					setState(2833);
					match(ESCAPE);
					setState(2834);
					((PredicateContext)_localctx).escapeChar = stringLit();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2837);
				match(IS);
				setState(2839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2838);
					match(NOT);
					}
				}

				setState(2841);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2842);
				match(IS);
				setState(2844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2843);
					match(NOT);
					}
				}

				setState(2846);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2847);
				match(IS);
				setState(2849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2848);
					match(NOT);
					}
				}

				setState(2851);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2852);
				match(FROM);
				setState(2853);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitValueExpressionDefault(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComparison(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticBinary(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticUnary(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2857);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2858);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & 35L) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2859);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2881);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2862);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2863);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 318)) & ~0x3f) == 0 && ((1L << (_la - 318)) & 7L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2864);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2865);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2866);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & 259L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2867);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2868);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2869);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2870);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2871);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2872);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2873);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2874);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2875);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2876);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2877);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2878);
						comparisonOperator();
						setState(2879);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatetimeUnitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public DatetimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDatetimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDatetimeUnit(this);
		}
	}

	public final DatetimeUnitContext datetimeUnit() throws RecognitionException {
		DatetimeUnitContext _localctx = new DatetimeUnitContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_datetimeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2886);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYOFYEAR || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 93458488360961L) != 0) || _la==QUARTER || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStruct(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDereference(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampaddContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext unitsAmount;
		public ValueExpressionContext timestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TimestampaddContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimestampadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimestampadd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubstring(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCast(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(SqlBaseParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLambda(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitParenthesizedExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Any_valueContext extends PrimaryExpressionContext {
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public Any_valueContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAny_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAny_value(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTrim(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSimpleCase(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CurrentLikeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public CurrentLikeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCurrentLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCurrentLike(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColumnReference(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowConstructor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLast(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOverlay(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public TerminalNode LEFT_BRACKET() { return getToken(SqlBaseParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SqlBaseParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubscript(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampdiffContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TimestampdiffContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimestampdiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimestampdiff(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubqueryExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConstantDefault(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExtract(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentileContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext percentage;
		public BooleanExpressionContext where;
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public SortItemContext sortItem() {
			return getRuleContext(SortItemContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode PERCENTILE_CONT() { return getToken(SqlBaseParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(SqlBaseParser.PERCENTILE_DISC, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public PercentileContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPercentile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSearchedCase(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPosition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFirst(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentLikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2889);
				((CurrentLikeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1873497444986126336L) != 0) || _la==USER) ) {
					((CurrentLikeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new TimestampaddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2890);
				((TimestampaddContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEADD || _la==TIMESTAMPADD) ) {
					((TimestampaddContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2891);
				match(LEFT_PAREN);
				setState(2892);
				((TimestampaddContext)_localctx).unit = datetimeUnit();
				setState(2893);
				match(COMMA);
				setState(2894);
				((TimestampaddContext)_localctx).unitsAmount = valueExpression(0);
				setState(2895);
				match(COMMA);
				setState(2896);
				((TimestampaddContext)_localctx).timestamp = valueExpression(0);
				setState(2897);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new TimestampdiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2899);
				((TimestampdiffContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEDIFF || _la==TIMESTAMPDIFF) ) {
					((TimestampdiffContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2900);
				match(LEFT_PAREN);
				setState(2901);
				((TimestampdiffContext)_localctx).unit = datetimeUnit();
				setState(2902);
				match(COMMA);
				setState(2903);
				((TimestampdiffContext)_localctx).startTimestamp = valueExpression(0);
				setState(2904);
				match(COMMA);
				setState(2905);
				((TimestampdiffContext)_localctx).endTimestamp = valueExpression(0);
				setState(2906);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2908);
				match(CASE);
				setState(2910); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2909);
					whenClause();
					}
					}
					setState(2912); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2914);
					match(ELSE);
					setState(2915);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2918);
				match(END);
				}
				break;
			case 5:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2920);
				match(CASE);
				setState(2921);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2923); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2922);
					whenClause();
					}
					}
					setState(2925); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2927);
					match(ELSE);
					setState(2928);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2931);
				match(END);
				}
				break;
			case 6:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2933);
				((CastContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CAST || _la==TRY_CAST) ) {
					((CastContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2934);
				match(LEFT_PAREN);
				setState(2935);
				expression();
				setState(2936);
				match(AS);
				setState(2937);
				dataType();
				setState(2938);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2940);
				match(STRUCT);
				setState(2941);
				match(LEFT_PAREN);
				setState(2950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
				case 1:
					{
					setState(2942);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2943);
						match(COMMA);
						setState(2944);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2949);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2952);
				match(RIGHT_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2953);
				match(FIRST);
				setState(2954);
				match(LEFT_PAREN);
				setState(2955);
				expression();
				setState(2958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2956);
					match(IGNORE);
					setState(2957);
					match(NULLS);
					}
				}

				setState(2960);
				match(RIGHT_PAREN);
				}
				break;
			case 9:
				{
				_localctx = new Any_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2962);
				match(ANY_VALUE);
				setState(2963);
				match(LEFT_PAREN);
				setState(2964);
				expression();
				setState(2967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2965);
					match(IGNORE);
					setState(2966);
					match(NULLS);
					}
				}

				setState(2969);
				match(RIGHT_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2971);
				match(LAST);
				setState(2972);
				match(LEFT_PAREN);
				setState(2973);
				expression();
				setState(2976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2974);
					match(IGNORE);
					setState(2975);
					match(NULLS);
					}
				}

				setState(2978);
				match(RIGHT_PAREN);
				}
				break;
			case 11:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2980);
				match(POSITION);
				setState(2981);
				match(LEFT_PAREN);
				setState(2982);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2983);
				match(IN);
				setState(2984);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2985);
				match(RIGHT_PAREN);
				}
				break;
			case 12:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2987);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2988);
				match(ASTERISK);
				}
				break;
			case 14:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2989);
				qualifiedName();
				setState(2990);
				match(DOT);
				setState(2991);
				match(ASTERISK);
				}
				break;
			case 15:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2993);
				match(LEFT_PAREN);
				setState(2994);
				namedExpression();
				setState(2997); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2995);
					match(COMMA);
					setState(2996);
					namedExpression();
					}
					}
					setState(2999); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(3001);
				match(RIGHT_PAREN);
				}
				break;
			case 16:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3003);
				match(LEFT_PAREN);
				setState(3004);
				query();
				setState(3005);
				match(RIGHT_PAREN);
				}
				break;
			case 17:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3007);
				functionName();
				setState(3008);
				match(LEFT_PAREN);
				setState(3020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
				case 1:
					{
					setState(3010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
					case 1:
						{
						setState(3009);
						setQuantifier();
						}
						break;
					}
					setState(3012);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(3017);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3013);
						match(COMMA);
						setState(3014);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(3019);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(3022);
				match(RIGHT_PAREN);
				setState(3029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
				case 1:
					{
					setState(3023);
					match(FILTER);
					setState(3024);
					match(LEFT_PAREN);
					setState(3025);
					match(WHERE);
					setState(3026);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(3027);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(3033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
				case 1:
					{
					setState(3031);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3032);
					match(NULLS);
					}
					break;
				}
				setState(3037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
				case 1:
					{
					setState(3035);
					match(OVER);
					setState(3036);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 18:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3039);
				identifier();
				setState(3040);
				match(ARROW);
				setState(3041);
				expression();
				}
				break;
			case 19:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3043);
				match(LEFT_PAREN);
				setState(3044);
				identifier();
				setState(3047); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3045);
					match(COMMA);
					setState(3046);
					identifier();
					}
					}
					setState(3049); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(3051);
				match(RIGHT_PAREN);
				setState(3052);
				match(ARROW);
				setState(3053);
				expression();
				}
				break;
			case 20:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3055);
				identifier();
				}
				break;
			case 21:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3056);
				match(LEFT_PAREN);
				setState(3057);
				expression();
				setState(3058);
				match(RIGHT_PAREN);
				}
				break;
			case 22:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3060);
				match(EXTRACT);
				setState(3061);
				match(LEFT_PAREN);
				setState(3062);
				((ExtractContext)_localctx).field = identifier();
				setState(3063);
				match(FROM);
				setState(3064);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(3065);
				match(RIGHT_PAREN);
				}
				break;
			case 23:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3067);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3068);
				match(LEFT_PAREN);
				setState(3069);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(3070);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3071);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(3074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==FOR) {
					{
					setState(3072);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3073);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(3076);
				match(RIGHT_PAREN);
				}
				break;
			case 24:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3078);
				match(TRIM);
				setState(3079);
				match(LEFT_PAREN);
				setState(3081);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
				case 1:
					{
					setState(3080);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(3084);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					{
					setState(3083);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(3086);
				match(FROM);
				setState(3087);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(3088);
				match(RIGHT_PAREN);
				}
				break;
			case 25:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3090);
				match(OVERLAY);
				setState(3091);
				match(LEFT_PAREN);
				setState(3092);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(3093);
				match(PLACING);
				setState(3094);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(3095);
				match(FROM);
				setState(3096);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(3099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(3097);
					match(FOR);
					setState(3098);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(3101);
				match(RIGHT_PAREN);
				}
				break;
			case 26:
				{
				_localctx = new PercentileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3103);
				((PercentileContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PERCENTILE_CONT || _la==PERCENTILE_DISC) ) {
					((PercentileContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3104);
				match(LEFT_PAREN);
				setState(3105);
				((PercentileContext)_localctx).percentage = valueExpression(0);
				setState(3106);
				match(RIGHT_PAREN);
				setState(3107);
				match(WITHIN);
				setState(3108);
				match(GROUP);
				setState(3109);
				match(LEFT_PAREN);
				setState(3110);
				match(ORDER);
				setState(3111);
				match(BY);
				setState(3112);
				sortItem();
				setState(3113);
				match(RIGHT_PAREN);
				setState(3120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
				case 1:
					{
					setState(3114);
					match(FILTER);
					setState(3115);
					match(LEFT_PAREN);
					setState(3116);
					match(WHERE);
					setState(3117);
					((PercentileContext)_localctx).where = booleanExpression(0);
					setState(3118);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(3124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
				case 1:
					{
					setState(3122);
					match(OVER);
					setState(3123);
					windowSpec();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(3128);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(3129);
						match(LEFT_BRACKET);
						setState(3130);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(3131);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(3133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(3134);
						match(DOT);
						setState(3135);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(3140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNullLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ConstantContext {
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStringLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTypeConstructor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterLiteralContext extends ConstantContext {
		public TerminalNode COLON() { return getToken(SqlBaseParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterParameterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitParameterLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntervalLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNumericLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_constant);
		try {
			int _alt;
			setState(3155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3141);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new ParameterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3142);
				match(COLON);
				setState(3143);
				identifier();
				}
				break;
			case 3:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3144);
				interval();
				}
				break;
			case 4:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3145);
				identifier();
				setState(3146);
				stringLit();
				}
				break;
			case 5:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3148);
				number();
				}
				break;
			case 6:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3149);
				booleanValue();
				}
				break;
			case 7:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3150);
						stringLit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3157);
			_la = _input.LA(1);
			if ( !(((((_la - 308)) & ~0x3f) == 0 && ((1L << (_la - 308)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3159);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicateOperator(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3161);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 577586652210266113L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBooleanValue(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3163);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3165);
			match(INTERVAL);
			setState(3168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				{
				setState(3166);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(3167);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext body;
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3170);
			((ErrorCapturingMultiUnitsIntervalContext)_localctx).body = multiUnitsInterval();
			setState(3172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				{
				setState(3171);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public UnitInMultiUnitsContext unitInMultiUnits;
		public List<UnitInMultiUnitsContext> unit = new ArrayList<UnitInMultiUnitsContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<UnitInMultiUnitsContext> unitInMultiUnits() {
			return getRuleContexts(UnitInMultiUnitsContext.class);
		}
		public UnitInMultiUnitsContext unitInMultiUnits(int i) {
			return getRuleContext(UnitInMultiUnitsContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiUnitsInterval(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3177); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3174);
					intervalValue();
					setState(3175);
					((MultiUnitsIntervalContext)_localctx).unitInMultiUnits = unitInMultiUnits();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).unitInMultiUnits);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3181);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(3184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				{
				setState(3182);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(3183);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public UnitInUnitToUnitContext from;
		public UnitInUnitToUnitContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<UnitInUnitToUnitContext> unitInUnitToUnit() {
			return getRuleContexts(UnitInUnitToUnitContext.class);
		}
		public UnitInUnitToUnitContext unitInUnitToUnit(int i) {
			return getRuleContext(UnitInUnitToUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnitToUnitInterval(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3186);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(3187);
			((UnitToUnitIntervalContext)_localctx).from = unitInUnitToUnit();
			setState(3188);
			match(TO);
			setState(3189);
			((UnitToUnitIntervalContext)_localctx).to = unitInUnitToUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntervalValue(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
			case 1:
				{
				setState(3191);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(3197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
			case 1:
				{
				setState(3194);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				{
				setState(3195);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				{
				setState(3196);
				stringLit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitInMultiUnitsContext extends ParserRuleContext {
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public UnitInMultiUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInMultiUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnitInMultiUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnitInMultiUnits(this);
		}
	}

	public final UnitInMultiUnitsContext unitInMultiUnits() throws RecognitionException {
		UnitInMultiUnitsContext _localctx = new UnitInMultiUnitsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_unitInMultiUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3199);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYS || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 7035774906138627L) != 0) || _la==SECOND || _la==SECONDS || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & 387L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitInUnitToUnitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public UnitInUnitToUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInUnitToUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnitInUnitToUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnitInUnitToUnit(this);
		}
	}

	public final UnitInUnitToUnitContext unitInUnitToUnit() throws RecognitionException {
		UnitInUnitToUnitContext _localctx = new UnitInUnitToUnitContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_unitInUnitToUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3201);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 87960930222081L) != 0) || _la==SECOND || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColPosition(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_colPosition);
		try {
			setState(3206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(3203);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3204);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(3205);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode COMMA() { return getToken(SqlBaseParser.COMMA, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexDataType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YearMonthIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public List<TerminalNode> MONTH() { return getTokens(SqlBaseParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(SqlBaseParser.MONTH, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public YearMonthIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterYearMonthIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitYearMonthIntervalDataType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DayTimeIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public List<TerminalNode> HOUR() { return getTokens(SqlBaseParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(SqlBaseParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(SqlBaseParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(SqlBaseParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(SqlBaseParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(SqlBaseParser.SECOND, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public DayTimeIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDayTimeIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDayTimeIntervalDataType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPrimitiveDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_dataType);
		int _la;
		try {
			setState(3254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3208);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(3209);
				match(LT);
				setState(3210);
				dataType();
				setState(3211);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3213);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(3214);
				match(LT);
				setState(3215);
				dataType();
				setState(3216);
				match(COMMA);
				setState(3217);
				dataType();
				setState(3218);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3220);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(3227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(3221);
					match(LT);
					setState(3223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
					case 1:
						{
						setState(3222);
						complexColTypeList();
						}
						break;
					}
					setState(3225);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(3226);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new YearMonthIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3229);
				match(INTERVAL);
				setState(3230);
				((YearMonthIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MONTH || _la==YEAR) ) {
					((YearMonthIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
				case 1:
					{
					setState(3231);
					match(TO);
					setState(3232);
					((YearMonthIntervalDataTypeContext)_localctx).to = match(MONTH);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new DayTimeIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3235);
				match(INTERVAL);
				setState(3236);
				((DayTimeIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==SECOND) ) {
					((DayTimeIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
				case 1:
					{
					setState(3237);
					match(TO);
					setState(3238);
					((DayTimeIntervalDataTypeContext)_localctx).to = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==HOUR || _la==MINUTE || _la==SECOND) ) {
						((DayTimeIntervalDataTypeContext)_localctx).to = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3241);
				identifier();
				setState(3252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
				case 1:
					{
					setState(3242);
					match(LEFT_PAREN);
					setState(3243);
					match(INTEGER_VALUE);
					setState(3248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3244);
						match(COMMA);
						setState(3245);
						match(INTEGER_VALUE);
						}
						}
						setState(3250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3251);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3256);
			qualifiedColTypeWithPosition();
			setState(3261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3257);
				match(COMMA);
				setState(3258);
				qualifiedColTypeWithPosition();
				}
				}
				setState(3263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedColTypeWithPosition(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3264);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(3265);
			dataType();
			setState(3268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3266);
				match(NOT);
				setState(3267);
				match(NULL);
				}
			}

			setState(3271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(3270);
				defaultExpression();
				}
			}

			setState(3274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3273);
				commentSpec();
				}
			}

			setState(3277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(3276);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultExpressionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDefaultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDefaultExpression(this);
		}
	}

	public final DefaultExpressionContext defaultExpression() throws RecognitionException {
		DefaultExpressionContext _localctx = new DefaultExpressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_defaultExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3279);
			match(DEFAULT);
			setState(3280);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColTypeList(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3282);
			colType();
			setState(3287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3283);
					match(COMMA);
					setState(3284);
					colType();
					}
					} 
				}
				setState(3289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColType(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3290);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3291);
			dataType();
			setState(3294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				{
				setState(3292);
				match(NOT);
				setState(3293);
				match(NULL);
				}
				break;
			}
			setState(3297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
			case 1:
				{
				setState(3296);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateOrReplaceTableColTypeListContext extends ParserRuleContext {
		public List<CreateOrReplaceTableColTypeContext> createOrReplaceTableColType() {
			return getRuleContexts(CreateOrReplaceTableColTypeContext.class);
		}
		public CreateOrReplaceTableColTypeContext createOrReplaceTableColType(int i) {
			return getRuleContext(CreateOrReplaceTableColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateOrReplaceTableColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateOrReplaceTableColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateOrReplaceTableColTypeList(this);
		}
	}

	public final CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() throws RecognitionException {
		CreateOrReplaceTableColTypeListContext _localctx = new CreateOrReplaceTableColTypeListContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_createOrReplaceTableColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3299);
			createOrReplaceTableColType();
			setState(3304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3300);
				match(COMMA);
				setState(3301);
				createOrReplaceTableColType();
				}
				}
				setState(3306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateOrReplaceTableColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ColDefinitionOptionContext> colDefinitionOption() {
			return getRuleContexts(ColDefinitionOptionContext.class);
		}
		public ColDefinitionOptionContext colDefinitionOption(int i) {
			return getRuleContext(ColDefinitionOptionContext.class,i);
		}
		public CreateOrReplaceTableColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateOrReplaceTableColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateOrReplaceTableColType(this);
		}
	}

	public final CreateOrReplaceTableColTypeContext createOrReplaceTableColType() throws RecognitionException {
		CreateOrReplaceTableColTypeContext _localctx = new CreateOrReplaceTableColTypeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_createOrReplaceTableColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3307);
			((CreateOrReplaceTableColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3308);
			dataType();
			setState(3312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==DEFAULT || _la==GENERATED || _la==NOT) {
				{
				{
				setState(3309);
				colDefinitionOption();
				}
				}
				setState(3314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public GenerationExpressionContext generationExpression() {
			return getRuleContext(GenerationExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colDefinitionOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColDefinitionOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColDefinitionOption(this);
		}
	}

	public final ColDefinitionOptionContext colDefinitionOption() throws RecognitionException {
		ColDefinitionOptionContext _localctx = new ColDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_colDefinitionOption);
		try {
			setState(3320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3315);
				match(NOT);
				setState(3316);
				match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3317);
				defaultExpression();
				}
				break;
			case GENERATED:
				enterOuterAlt(_localctx, 3);
				{
				setState(3318);
				generationExpression();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(3319);
				commentSpec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenerationExpressionContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(SqlBaseParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SqlBaseParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public GenerationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGenerationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGenerationExpression(this);
		}
	}

	public final GenerationExpressionContext generationExpression() throws RecognitionException {
		GenerationExpressionContext _localctx = new GenerationExpressionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_generationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3322);
			match(GENERATED);
			setState(3323);
			match(ALWAYS);
			setState(3324);
			match(AS);
			setState(3325);
			match(LEFT_PAREN);
			setState(3326);
			expression();
			setState(3327);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexColTypeList(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3329);
			complexColType();
			setState(3334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3330);
				match(COMMA);
				setState(3331);
				complexColType();
				}
				}
				setState(3336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SqlBaseParser.COLON, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexColType(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3337);
			identifier();
			setState(3339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
			case 1:
				{
				setState(3338);
				match(COLON);
				}
				break;
			}
			setState(3341);
			dataType();
			setState(3344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3342);
				match(NOT);
				setState(3343);
				match(NULL);
				}
			}

			setState(3347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3346);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWhenClause(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3349);
			match(WHEN);
			setState(3350);
			((WhenClauseContext)_localctx).condition = expression();
			setState(3351);
			match(THEN);
			setState(3352);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowClause(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3354);
			match(WINDOW);
			setState(3355);
			namedWindow();
			setState(3360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3356);
					match(COMMA);
					setState(3357);
					namedWindow();
					}
					} 
				}
				setState(3362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedWindow(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3363);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(3364);
			match(AS);
			setState(3365);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowRef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowDef(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_windowSpec);
		int _la;
		try {
			setState(3413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3367);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3368);
				match(LEFT_PAREN);
				setState(3369);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(3370);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3372);
				match(LEFT_PAREN);
				setState(3407);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(3373);
					match(CLUSTER);
					setState(3374);
					match(BY);
					setState(3375);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(3380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3376);
						match(COMMA);
						setState(3377);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(3382);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case RIGHT_PAREN:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(3393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(3383);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3384);
						match(BY);
						setState(3385);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(3390);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3386);
							match(COMMA);
							setState(3387);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(3392);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(3405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(3395);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3396);
						match(BY);
						setState(3397);
						sortItem();
						setState(3402);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3398);
							match(COMMA);
							setState(3399);
							sortItem();
							}
							}
							setState(3404);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(3409);
					windowFrame();
					}
				}

				setState(3412);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowFrame(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_windowFrame);
		try {
			setState(3431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3415);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3416);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3417);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3418);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3419);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3420);
				match(BETWEEN);
				setState(3421);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3422);
				match(AND);
				setState(3423);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3425);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3426);
				match(BETWEEN);
				setState(3427);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3428);
				match(AND);
				setState(3429);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFrameBound(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_frameBound);
		int _la;
		try {
			setState(3440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3433);
				match(UNBOUNDED);
				setState(3434);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3435);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3436);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3437);
				expression();
				setState(3438);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3442);
			qualifiedName();
			setState(3447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3443);
				match(COMMA);
				setState(3444);
				qualifiedName();
				}
				}
				setState(3449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_functionName);
		try {
			setState(3454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,445,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3450);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3451);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3452);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3453);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3456);
			identifier();
			setState(3461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3457);
					match(DOT);
					setState(3458);
					identifier();
					}
					} 
				}
				setState(3463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingIdentifier(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3464);
			identifier();
			setState(3465);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorIdent(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRealIdent(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3469); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3467);
						match(MINUS);
						setState(3468);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3471); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,447,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_identifier);
		try {
			setState(3479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,449,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3476);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3477);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3478);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuotedIdentifierAlternative(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnquotedIdentifier(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_strictIdentifier);
		try {
			setState(3487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,450,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3481);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3482);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3483);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3484);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3485);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3486);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public TerminalNode DOUBLEQUOTED_STRING() { return getToken(SqlBaseParser.DOUBLEQUOTED_STRING, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuotedIdentifier(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_quotedIdentifier);
		try {
			setState(3492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,451,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3489);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3490);
				if (!(double_quoted_identifiers)) throw new FailedPredicateException(this, "double_quoted_identifiers");
				setState(3491);
				match(DOUBLEQUOTED_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackQuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backQuotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBackQuotedIdentifier(this);
		}
	}

	public final BackQuotedIdentifierContext backQuotedIdentifier() throws RecognitionException {
		BackQuotedIdentifierContext _localctx = new BackQuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_backQuotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3494);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDecimalLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBigIntLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTinyIntLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLegacyDecimalLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBigDecimalLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExponentLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDoubleLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntegerLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFloatLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSmallIntLiteral(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_number);
		int _la;
		try {
			setState(3539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,462,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3496);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3497);
					match(MINUS);
					}
				}

				setState(3500);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3501);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3502);
					match(MINUS);
					}
				}

				setState(3505);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3506);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3507);
					match(MINUS);
					}
				}

				setState(3510);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3511);
					match(MINUS);
					}
				}

				setState(3514);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3515);
					match(MINUS);
					}
				}

				setState(3518);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3519);
					match(MINUS);
					}
				}

				setState(3522);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3523);
					match(MINUS);
					}
				}

				setState(3526);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3527);
					match(MINUS);
					}
				}

				setState(3530);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3531);
					match(MINUS);
					}
				}

				setState(3534);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3535);
					match(MINUS);
					}
				}

				setState(3538);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public Token dropDefault;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterColumnAction(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_alterColumnAction);
		int _la;
		try {
			setState(3552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,463,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3541);
				match(TYPE);
				setState(3542);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3543);
				commentSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3544);
				colPosition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3545);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3546);
				match(NOT);
				setState(3547);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3548);
				match(SET);
				setState(3549);
				defaultExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3550);
				((AlterColumnActionContext)_localctx).dropDefault = match(DROP);
				setState(3551);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLitContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode DOUBLEQUOTED_STRING() { return getToken(SqlBaseParser.DOUBLEQUOTED_STRING, 0); }
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStringLit(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_stringLit);
		try {
			setState(3557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,464,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3554);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3555);
				if (!(!double_quoted_identifiers)) throw new FailedPredicateException(this, "!double_quoted_identifiers");
				setState(3556);
				match(DOUBLEQUOTED_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_comment);
		try {
			setState(3561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,465,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3559);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3560);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VersionContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_version);
		try {
			setState(3565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,466,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3563);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3564);
				stringLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(SqlBaseParser.ALWAYS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GENERATED() { return getToken(SqlBaseParser.GENERATED, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnsiNonReserved(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3567);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -2191012289037026560L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4906136928869974017L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -677567443547206837L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -4576167932199175L) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & 4028402566609403L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStrictNonReserved(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3569);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 20557019150811137L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 2251799813685377L) != 0) || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & 577586652210266177L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(SqlBaseParser.ALWAYS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GENERATED() { return getToken(SqlBaseParser.GENERATED, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(SqlBaseParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(SqlBaseParser.PERCENTILE_DISC, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNonReserved(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3571);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -18014398509515008L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611703610621820929L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -567347999941765L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -285873560092673L) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & 4503461919981567L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 120:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 122:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 124:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 162:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 163:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 164:
			return quotedIdentifier_sempred((QuotedIdentifierContext)_localctx, predIndex);
		case 166:
			return number_sempred((NumberContext)_localctx, predIndex);
		case 168:
			return stringLit_sempred((StringLitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean quotedIdentifier_sempred(QuotedIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return double_quoted_identifiers;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 22:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}
	private boolean stringLit_sempred(StringLitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return !double_quoted_identifiers;
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u015a\u0df6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0001\u0000\u0001\u0000\u0005\u0000\u015f\b\u0000\n\u0000\f\u0000"+
		"\u0162\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u017a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0187\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u018e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0196\b\u0007\n\u0007"+
		"\f\u0007\u0199\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u01ac\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u01b0\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u01b6\b\u0007\u0001\u0007\u0003\u0007\u01b9\b\u0007\u0001\u0007\u0003"+
		"\u0007\u01bc\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u01c3\b\u0007\u0001\u0007\u0003\u0007\u01c6\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u01ca\b\u0007\u0001\u0007\u0003\u0007"+
		"\u01cd\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u01d4\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u01df\b\u0007\n\u0007\f\u0007\u01e2\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u01e9\b\u0007\u0001\u0007\u0003"+
		"\u0007\u01ec\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u01f0\b\u0007"+
		"\u0001\u0007\u0003\u0007\u01f3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u01f9\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0204\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u020a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u020f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0231\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u023e\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0257\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0260\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0264\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u026a\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u026e\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0273\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0279\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0285\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u028d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0293\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u02a0\b\u0007\u0001\u0007\u0004\u0007\u02a3\b\u0007"+
		"\u000b\u0007\f\u0007\u02a4\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02b5\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u02ba\b\u0007\n\u0007"+
		"\f\u0007\u02bd\t\u0007\u0001\u0007\u0003\u0007\u02c0\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02c6\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u02d5\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02d9\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02df"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02e5"+
		"\b\u0007\u0001\u0007\u0003\u0007\u02e8\b\u0007\u0001\u0007\u0003\u0007"+
		"\u02eb\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u02f1\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02f5\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u02fd\b\u0007\n\u0007\f\u0007\u0300\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0308\b\u0007"+
		"\u0001\u0007\u0003\u0007\u030b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0314\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0319\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u031f\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0326\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0329\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u032f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0338\b\u0007"+
		"\n\u0007\f\u0007\u033b\t\u0007\u0003\u0007\u033d\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0341\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0346\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u034b"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0352\b\u0007\u0001\u0007\u0003\u0007\u0355\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0358\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u035f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0364\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u036d\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0375\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u037b\b\u0007\u0001\u0007\u0003\u0007\u037e\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0381\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0387\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u038b\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0390\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0393\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0397\b"+
		"\u0007\u0003\u0007\u0399\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03a1\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03a9"+
		"\b\u0007\u0001\u0007\u0003\u0007\u03ac\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03b1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03b7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03bd\b\u0007\u0001\u0007\u0003\u0007\u03c0\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03c4\b\u0007\u0001\u0007\u0003"+
		"\u0007\u03c7\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03cb\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u03e5\b\u0007\n\u0007\f\u0007\u03e8\t\u0007\u0003\u0007\u03ea"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03ee\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03f4\b\u0007\u0001\u0007"+
		"\u0003\u0007\u03f7\b\u0007\u0001\u0007\u0003\u0007\u03fa\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0400\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0408\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u040d"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0413"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0419"+
		"\b\u0007\u0001\u0007\u0003\u0007\u041c\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0423\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0428\b\u0007\n\u0007\f\u0007\u042b"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0430\b\u0007"+
		"\n\u0007\f\u0007\u0433\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0441\b\u0007\n\u0007\f\u0007"+
		"\u0444\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u044f\b\u0007"+
		"\n\u0007\f\u0007\u0452\t\u0007\u0003\u0007\u0454\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0458\b\u0007\n\u0007\f\u0007\u045b\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0461\b\u0007\n\u0007"+
		"\f\u0007\u0464\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u046a\b\u0007\n\u0007\f\u0007\u046d\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0474\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0479\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u047e\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0485\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u048b\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0490\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0496\b\u0007\n\u0007\f\u0007\u0499\t\u0007"+
		"\u0003\u0007\u049b\b\u0007\u0001\b\u0001\b\u0003\b\u049f\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u04ab\b\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u04af\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u04b6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u052a\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0532"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u053a\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0543\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u054d\b\u000b\u0001\f\u0001\f\u0003\f\u0551"+
		"\b\f\u0001\f\u0003\f\u0554\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u055a\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u0560\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u056c\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0578\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u057d\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u0586\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u058e\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0595\b\u0013\u0003\u0013\u0597\b\u0013\u0001\u0013"+
		"\u0003\u0013\u059a\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u059f\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u05a3\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u05a8\b\u0013\u0001\u0013\u0003"+
		"\u0013\u05ab\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u05b0"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u05b9\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u05be\b\u0013\u0001\u0013\u0003\u0013\u05c1\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u05c6\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u05ca\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u05cf\b\u0013\u0003\u0013\u05d1\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u05d5\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u05dc\b\u0015\n\u0015\f\u0015\u05df\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u05e6\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u05ec\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u05f7\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u05fc\b\u001a\n\u001a"+
		"\f\u001a\u05ff\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u0605\b\u001b\n\u001b\f\u001b\u0608\t\u001b\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u060c\b\u001c\u0001\u001c\u0003\u001c\u060f\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u0625\b\u001e\n\u001e\f\u001e\u0628"+
		"\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u062e"+
		"\b\u001f\n\u001f\f\u001f\u0631\t\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0003 \u0637\b \u0001 \u0003 \u063a\b \u0001!\u0001!\u0001!\u0005"+
		"!\u063f\b!\n!\f!\u0642\t!\u0001!\u0003!\u0645\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u064b\b\"\u0001#\u0001#\u0001#\u0001#\u0005#\u0651"+
		"\b#\n#\f#\u0654\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u065c"+
		"\b$\n$\f$\u065f\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0669\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0671"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0677\b\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0004)\u0681\b)\u000b)\f)\u0682\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u068a\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0691\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u069d\b)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u06a3\b)\n)\f)\u06a6\t)\u0001)\u0005)\u06a9\b)\n)\f)\u06ac\t)\u0001"+
		")\u0005)\u06af\b)\n)\f)\u06b2\t)\u0003)\u06b4\b)\u0001*\u0001*\u0001*"+
		"\u0001*\u0001*\u0005*\u06bb\b*\n*\f*\u06be\t*\u0003*\u06c0\b*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0005*\u06c7\b*\n*\f*\u06ca\t*\u0003*\u06cc\b*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u06d3\b*\n*\f*\u06d6\t*\u0003"+
		"*\u06d8\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u06df\b*\n*\f*\u06e2"+
		"\t*\u0003*\u06e4\b*\u0001*\u0003*\u06e7\b*\u0001*\u0001*\u0001*\u0003"+
		"*\u06ec\b*\u0003*\u06ee\b*\u0001*\u0001*\u0003*\u06f2\b*\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u06fe"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0705\b,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u070c\b,\u0001,\u0005,\u070f\b,\n,\f,\u0712\t,"+
		"\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u071d\b-\u0001.\u0001.\u0003.\u0721\b.\u0001.\u0001.\u0003.\u0725\b"+
		".\u0001/\u0001/\u0004/\u0729\b/\u000b/\f/\u072a\u00010\u00010\u00030\u072f"+
		"\b0\u00010\u00010\u00010\u00010\u00050\u0735\b0\n0\f0\u0738\t0\u00010"+
		"\u00030\u073b\b0\u00010\u00030\u073e\b0\u00010\u00030\u0741\b0\u00010"+
		"\u00030\u0744\b0\u00010\u00010\u00030\u0748\b0\u00011\u00011\u00031\u074c"+
		"\b1\u00011\u00051\u074f\b1\n1\f1\u0752\t1\u00011\u00031\u0755\b1\u0001"+
		"1\u00031\u0758\b1\u00011\u00031\u075b\b1\u00011\u00031\u075e\b1\u0001"+
		"1\u00011\u00031\u0762\b1\u00011\u00051\u0765\b1\n1\f1\u0768\t1\u00011"+
		"\u00031\u076b\b1\u00011\u00031\u076e\b1\u00011\u00031\u0771\b1\u00011"+
		"\u00031\u0774\b1\u00031\u0776\b1\u00012\u00012\u00012\u00012\u00032\u077c"+
		"\b2\u00012\u00012\u00012\u00012\u00012\u00032\u0783\b2\u00012\u00012\u0001"+
		"2\u00032\u0788\b2\u00012\u00032\u078b\b2\u00012\u00032\u078e\b2\u0001"+
		"2\u00012\u00032\u0792\b2\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u079c\b2\u00012\u00012\u00032\u07a0\b2\u00032\u07a2\b"+
		"2\u00012\u00032\u07a5\b2\u00012\u00012\u00032\u07a9\b2\u00013\u00013\u0005"+
		"3\u07ad\b3\n3\f3\u07b0\t3\u00013\u00033\u07b3\b3\u00013\u00013\u00014"+
		"\u00014\u00014\u00015\u00015\u00015\u00015\u00035\u07be\b5\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00016\u00036\u07c8\b6\u00016\u0001"+
		"6\u00036\u07cc\b6\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u07d8\b7\u00017\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u07e4\b8\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00059\u07f1\b9\n9"+
		"\f9\u07f4\t9\u00019\u00019\u00039\u07f8\b9\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u07fe\b:\u0001;\u0001;\u0001;\u0005;\u0803\b;\n;\f;\u0806\t;"+
		"\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0003?\u0815\b?\u0001?\u0005?\u0818\b?\n?\f?\u081b"+
		"\t?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0005@\u0825"+
		"\b@\n@\f@\u0828\t@\u0001@\u0001@\u0003@\u082c\b@\u0001A\u0001A\u0001A"+
		"\u0001A\u0005A\u0832\bA\nA\fA\u0835\tA\u0001A\u0005A\u0838\bA\nA\fA\u083b"+
		"\tA\u0001A\u0003A\u083e\bA\u0001A\u0003A\u0841\bA\u0001B\u0003B\u0844"+
		"\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u084b\bB\u0001B\u0001B\u0001"+
		"B\u0001B\u0003B\u0851\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0005C\u0858"+
		"\bC\nC\fC\u085b\tC\u0001C\u0001C\u0001C\u0001C\u0001C\u0005C\u0862\bC"+
		"\nC\fC\u0865\tC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0005C\u0871\bC\nC\fC\u0874\tC\u0001C\u0001C\u0003C\u0878"+
		"\bC\u0003C\u087a\bC\u0001D\u0001D\u0003D\u087e\bD\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0005E\u0885\bE\nE\fE\u0888\tE\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0005E\u0892\bE\nE\fE\u0895\tE\u0001E\u0001"+
		"E\u0003E\u0899\bE\u0001F\u0001F\u0003F\u089d\bF\u0001G\u0001G\u0001G\u0001"+
		"G\u0005G\u08a3\bG\nG\fG\u08a6\tG\u0003G\u08a8\bG\u0001G\u0001G\u0003G"+
		"\u08ac\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0005H\u08b8\bH\nH\fH\u08bb\tH\u0001H\u0001H\u0001H\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0005I\u08c5\bI\nI\fI\u08c8\tI\u0001I\u0001I\u0003"+
		"I\u08cc\bI\u0001J\u0001J\u0003J\u08d0\bJ\u0001J\u0003J\u08d3\bJ\u0001"+
		"K\u0001K\u0003K\u08d7\bK\u0001K\u0001K\u0001K\u0001K\u0003K\u08dd\bK\u0001"+
		"K\u0003K\u08e0\bK\u0001L\u0001L\u0001L\u0001M\u0001M\u0003M\u08e7\bM\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0005N\u08f1\bN\nN"+
		"\fN\u08f4\tN\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0005O\u08fc\b"+
		"O\nO\fO\u08ff\tO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0005O\u0909\bO\nO\fO\u090c\tO\u0001O\u0001O\u0001P\u0001P\u0001P\u0001"+
		"P\u0005P\u0914\bP\nP\fP\u0917\tP\u0001P\u0001P\u0003P\u091b\bP\u0001Q"+
		"\u0001Q\u0001R\u0001R\u0001S\u0001S\u0003S\u0923\bS\u0001T\u0001T\u0001"+
		"U\u0003U\u0928\bU\u0001U\u0001U\u0001V\u0001V\u0001V\u0003V\u092f\bV\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0005V\u0936\bV\nV\fV\u0939\tV\u0003V\u093b"+
		"\bV\u0001V\u0001V\u0001V\u0003V\u0940\bV\u0001V\u0001V\u0001V\u0005V\u0945"+
		"\bV\nV\fV\u0948\tV\u0003V\u094a\bV\u0001W\u0001W\u0001X\u0003X\u094f\b"+
		"X\u0001X\u0001X\u0005X\u0953\bX\nX\fX\u0956\tX\u0001Y\u0001Y\u0001Y\u0003"+
		"Y\u095b\bY\u0001Z\u0001Z\u0001Z\u0003Z\u0960\bZ\u0001Z\u0001Z\u0003Z\u0964"+
		"\bZ\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u096a\bZ\u0001Z\u0001Z\u0003Z\u096e"+
		"\bZ\u0001[\u0003[\u0971\b[\u0001[\u0001[\u0001[\u0003[\u0976\b[\u0001"+
		"[\u0003[\u0979\b[\u0001[\u0001[\u0001[\u0003[\u097e\b[\u0001[\u0001[\u0003"+
		"[\u0982\b[\u0001[\u0003[\u0985\b[\u0001[\u0003[\u0988\b[\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0003\\\u098e\b\\\u0001]\u0001]\u0001]\u0003]\u0993"+
		"\b]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u099a\b]\u0001^\u0003^\u099d"+
		"\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u09af\b^\u0003^\u09b1"+
		"\b^\u0001^\u0003^\u09b4\b^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001"+
		"`\u0005`\u09bd\b`\n`\f`\u09c0\t`\u0001a\u0001a\u0001a\u0001a\u0005a\u09c6"+
		"\ba\na\fa\u09c9\ta\u0001a\u0001a\u0001b\u0001b\u0003b\u09cf\bb\u0001c"+
		"\u0001c\u0001c\u0001c\u0005c\u09d5\bc\nc\fc\u09d8\tc\u0001c\u0001c\u0001"+
		"d\u0001d\u0003d\u09de\bd\u0001e\u0001e\u0003e\u09e2\be\u0001e\u0003e\u09e5"+
		"\be\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0003e\u09ed\be\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0003e\u09f5\be\u0001e\u0001e\u0001e\u0001"+
		"e\u0003e\u09fb\be\u0001f\u0001f\u0001f\u0001f\u0005f\u0a01\bf\nf\ff\u0a04"+
		"\tf\u0001f\u0001f\u0001g\u0001g\u0001g\u0001g\u0001g\u0005g\u0a0d\bg\n"+
		"g\fg\u0a10\tg\u0003g\u0a12\bg\u0001g\u0001g\u0001g\u0001h\u0003h\u0a18"+
		"\bh\u0001h\u0001h\u0003h\u0a1c\bh\u0003h\u0a1e\bh\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0003i\u0a27\bi\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0a33\bi\u0003i\u0a35"+
		"\bi\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0a3c\bi\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0003i\u0a43\bi\u0001i\u0001i\u0001i\u0001i\u0003i\u0a49"+
		"\bi\u0001i\u0001i\u0001i\u0001i\u0003i\u0a4f\bi\u0003i\u0a51\bi\u0001"+
		"j\u0001j\u0001j\u0005j\u0a56\bj\nj\fj\u0a59\tj\u0001k\u0001k\u0001k\u0005"+
		"k\u0a5e\bk\nk\fk\u0a61\tk\u0001l\u0001l\u0001l\u0005l\u0a66\bl\nl\fl\u0a69"+
		"\tl\u0001m\u0001m\u0001m\u0003m\u0a6e\bm\u0001n\u0001n\u0001n\u0003n\u0a73"+
		"\bn\u0001n\u0001n\u0001o\u0001o\u0001o\u0003o\u0a7a\bo\u0001o\u0001o\u0001"+
		"p\u0001p\u0003p\u0a80\bp\u0001p\u0001p\u0003p\u0a84\bp\u0003p\u0a86\b"+
		"p\u0001q\u0001q\u0001q\u0005q\u0a8b\bq\nq\fq\u0a8e\tq\u0001r\u0001r\u0001"+
		"r\u0001r\u0005r\u0a94\br\nr\fr\u0a97\tr\u0001r\u0001r\u0001s\u0001s\u0003"+
		"s\u0a9d\bs\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0005t\u0aa5\bt\n"+
		"t\ft\u0aa8\tt\u0001t\u0001t\u0003t\u0aac\bt\u0001u\u0001u\u0003u\u0ab0"+
		"\bu\u0001v\u0001v\u0001w\u0001w\u0001w\u0005w\u0ab7\bw\nw\fw\u0aba\tw"+
		"\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0003x\u0ac6\bx\u0003x\u0ac8\bx\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0005x\u0ad0\bx\nx\fx\u0ad3\tx\u0001y\u0003y\u0ad6\by\u0001y\u0001y"+
		"\u0001y\u0001y\u0001y\u0001y\u0003y\u0ade\by\u0001y\u0001y\u0001y\u0001"+
		"y\u0001y\u0005y\u0ae5\by\ny\fy\u0ae8\ty\u0001y\u0001y\u0001y\u0003y\u0aed"+
		"\by\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003y\u0af5\by\u0001y\u0001"+
		"y\u0001y\u0003y\u0afa\by\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001"+
		"y\u0001y\u0005y\u0b04\by\ny\fy\u0b07\ty\u0001y\u0001y\u0003y\u0b0b\by"+
		"\u0001y\u0003y\u0b0e\by\u0001y\u0001y\u0001y\u0001y\u0003y\u0b14\by\u0001"+
		"y\u0001y\u0003y\u0b18\by\u0001y\u0001y\u0001y\u0003y\u0b1d\by\u0001y\u0001"+
		"y\u0001y\u0003y\u0b22\by\u0001y\u0001y\u0001y\u0003y\u0b27\by\u0001z\u0001"+
		"z\u0001z\u0001z\u0003z\u0b2d\bz\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0005z\u0b42\bz\nz\fz\u0b45\tz\u0001{\u0001{\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0004|\u0b5f\b|\u000b|\f|\u0b60\u0001|\u0001|\u0003|\u0b65\b"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0004|\u0b6c\b|\u000b|\f|\u0b6d\u0001"+
		"|\u0001|\u0003|\u0b72\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0005|\u0b82\b|\n|"+
		"\f|\u0b85\t|\u0003|\u0b87\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0003|\u0b8f\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003"+
		"|\u0b98\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003|\u0ba1"+
		"\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0004"+
		"|\u0bb6\b|\u000b|\f|\u0bb7\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0003|\u0bc3\b|\u0001|\u0001|\u0001|\u0005|\u0bc8\b|\n"+
		"|\f|\u0bcb\t|\u0003|\u0bcd\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0003|\u0bd6\b|\u0001|\u0001|\u0003|\u0bda\b|\u0001|\u0001|\u0003"+
		"|\u0bde\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0004"+
		"|\u0be8\b|\u000b|\f|\u0be9\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003|\u0c03\b|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0003|\u0c0a\b|\u0001|\u0003|\u0c0d\b|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0003|\u0c1c\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0003|\u0c31\b|\u0001|\u0001|\u0003|\u0c35\b|\u0003|\u0c37"+
		"\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0005|\u0c41"+
		"\b|\n|\f|\u0c44\t|\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001}\u0004}\u0c50\b}\u000b}\f}\u0c51\u0003}\u0c54\b}\u0001"+
		"~\u0001~\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0081\u0001"+
		"\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u0c61\b\u0082\u0001"+
		"\u0083\u0001\u0083\u0003\u0083\u0c65\b\u0083\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0004\u0084\u0c6a\b\u0084\u000b\u0084\f\u0084\u0c6b\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0003\u0085\u0c71\b\u0085\u0001\u0086\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0087\u0003\u0087\u0c79\b\u0087"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u0c7e\b\u0087\u0001\u0088"+
		"\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0003\u008a\u0c87\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b"+
		"\u0c98\b\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0c9c\b\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0ca2\b\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0ca8\b\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0005\u008b\u0caf"+
		"\b\u008b\n\u008b\f\u008b\u0cb2\t\u008b\u0001\u008b\u0003\u008b\u0cb5\b"+
		"\u008b\u0003\u008b\u0cb7\b\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0005"+
		"\u008c\u0cbc\b\u008c\n\u008c\f\u008c\u0cbf\t\u008c\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0003\u008d\u0cc5\b\u008d\u0001\u008d\u0003\u008d"+
		"\u0cc8\b\u008d\u0001\u008d\u0003\u008d\u0ccb\b\u008d\u0001\u008d\u0003"+
		"\u008d\u0cce\b\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0005\u008f\u0cd6\b\u008f\n\u008f\f\u008f\u0cd9\t\u008f"+
		"\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u0cdf\b\u0090"+
		"\u0001\u0090\u0003\u0090\u0ce2\b\u0090\u0001\u0091\u0001\u0091\u0001\u0091"+
		"\u0005\u0091\u0ce7\b\u0091\n\u0091\f\u0091\u0cea\t\u0091\u0001\u0092\u0001"+
		"\u0092\u0001\u0092\u0005\u0092\u0cef\b\u0092\n\u0092\f\u0092\u0cf2\t\u0092"+
		"\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093"+
		"\u0cf9\b\u0093\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094"+
		"\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0005\u0095"+
		"\u0d05\b\u0095\n\u0095\f\u0095\u0d08\t\u0095\u0001\u0096\u0001\u0096\u0003"+
		"\u0096\u0d0c\b\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0003\u0096\u0d11"+
		"\b\u0096\u0001\u0096\u0003\u0096\u0d14\b\u0096\u0001\u0097\u0001\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0098\u0005\u0098\u0d1f\b\u0098\n\u0098\f\u0098\u0d22\t\u0098\u0001"+
		"\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u009a\u0001\u009a\u0001"+
		"\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001"+
		"\u009a\u0001\u009a\u0001\u009a\u0005\u009a\u0d33\b\u009a\n\u009a\f\u009a"+
		"\u0d36\t\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0005\u009a\u0d3d\b\u009a\n\u009a\f\u009a\u0d40\t\u009a\u0003\u009a\u0d42"+
		"\b\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0005"+
		"\u009a\u0d49\b\u009a\n\u009a\f\u009a\u0d4c\t\u009a\u0003\u009a\u0d4e\b"+
		"\u009a\u0003\u009a\u0d50\b\u009a\u0001\u009a\u0003\u009a\u0d53\b\u009a"+
		"\u0001\u009a\u0003\u009a\u0d56\b\u009a\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0003\u009b\u0d68\b\u009b\u0001\u009c\u0001\u009c\u0001\u009c"+
		"\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u0d71\b\u009c"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0005\u009d\u0d76\b\u009d\n\u009d"+
		"\f\u009d\u0d79\t\u009d\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0003\u009e\u0d7f\b\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0005\u009f"+
		"\u0d84\b\u009f\n\u009f\f\u009f\u0d87\t\u009f\u0001\u00a0\u0001\u00a0\u0001"+
		"\u00a0\u0001\u00a1\u0001\u00a1\u0004\u00a1\u0d8e\b\u00a1\u000b\u00a1\f"+
		"\u00a1\u0d8f\u0001\u00a1\u0003\u00a1\u0d93\b\u00a1\u0001\u00a2\u0001\u00a2"+
		"\u0001\u00a2\u0003\u00a2\u0d98\b\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a3"+
		"\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0da0\b\u00a3\u0001\u00a4"+
		"\u0001\u00a4\u0001\u00a4\u0003\u00a4\u0da5\b\u00a4\u0001\u00a5\u0001\u00a5"+
		"\u0001\u00a6\u0001\u00a6\u0003\u00a6\u0dab\b\u00a6\u0001\u00a6\u0001\u00a6"+
		"\u0001\u00a6\u0003\u00a6\u0db0\b\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6"+
		"\u0003\u00a6\u0db5\b\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6\u0db9\b"+
		"\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6\u0dbd\b\u00a6\u0001\u00a6\u0001"+
		"\u00a6\u0003\u00a6\u0dc1\b\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6\u0dc5"+
		"\b\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6\u0dc9\b\u00a6\u0001\u00a6"+
		"\u0001\u00a6\u0003\u00a6\u0dcd\b\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6"+
		"\u0dd1\b\u00a6\u0001\u00a6\u0003\u00a6\u0dd4\b\u00a6\u0001\u00a7\u0001"+
		"\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001"+
		"\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0003\u00a7\u0de1\b\u00a7\u0001"+
		"\u00a8\u0001\u00a8\u0001\u00a8\u0003\u00a8\u0de6\b\u00a8\u0001\u00a9\u0001"+
		"\u00a9\u0003\u00a9\u0dea\b\u00a9\u0001\u00aa\u0001\u00aa\u0003\u00aa\u0dee"+
		"\b\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ad\u0001"+
		"\u00ad\u0001\u00ad\t\u03e6\u0429\u0431\u0442\u0450\u0459\u0462\u046b\u0497"+
		"\u0004X\u00f0\u00f4\u00f8\u00ae\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u0000:\u0002\u0000EE\u00ca\u00ca"+
		"\u0002\u0000\u001e\u001e\u00db\u00db\u0002\u0000kkzz\u0001\u0000+,\u0002"+
		"\u0000\u0102\u0102\u0128\u0128\u0002\u0000\u000b\u000b##\u0005\u0000("+
		"(44]]jj\u0098\u0098\u0001\u0000JK\u0002\u0000]]jj\u0003\u0000\b\bRR\u00ff"+
		"\u00ff\u0002\u0000\b\b\u0092\u0092\u0003\u0000AA\u00a6\u00a6\u00e7\u00e7"+
		"\u0003\u0000BB\u00a7\u00a7\u00e8\u00e8\u0004\u0000WW\u0082\u0082\u00f0"+
		"\u00f0\u011c\u011c\u0003\u0000WW\u00f0\u00f0\u011c\u011c\u0002\u0000\u0015"+
		"\u0015JJ\u0002\u0000ee\u0089\u0089\u0002\u0000\u0101\u0101\u0127\u0127"+
		"\u0002\u0000\u0100\u0100\u010b\u010b\u0002\u000077\u00e2\u00e2\u0002\u0000"+
		"YY{{\u0002\u0000\n\nOO\u0002\u0000\u014f\u014f\u0151\u0151\u0001\u0000"+
		"\u008e\u008f\u0003\u0000\n\n\u0010\u0010\u00f4\u00f4\u0003\u0000``\u0115"+
		"\u0115\u011e\u011e\u0002\u0000\u013c\u013d\u0141\u0141\u0002\u0000QQ\u013e"+
		"\u0140\u0002\u0000\u013c\u013d\u0144\u0144\u000b\u0000==??uu\u009d\u009d"+
		"\u009f\u009f\u00a1\u00a1\u00a3\u00a3\u00cc\u00cc\u00e5\u00e5\u012a\u012a"+
		"\u0131\u0131\u0003\u000099;<\u0124\u0124\u0002\u0000CC\u010c\u010c\u0002"+
		"\u0000DD\u010d\u010d\u0002\u0000  \u0117\u0117\u0002\u0000xx\u00da\u00da"+
		"\u0001\u0000\u00fd\u00fe\u0002\u0000\u0004\u0004kk\u0002\u0000\u0004\u0004"+
		"gg\u0003\u0000\u0019\u0019\u008c\u008c\u0110\u0110\u0001\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0134\u013b\u0002\u0000QQ\u013c\u0145\u0004\u0000\u000e\u000e"+
		"zz\u00ac\u00ac\u00b5\u00b5\u0002\u0000``\u0115\u0115\u0001\u0000\u013c"+
		"\u013d\u0007\u0000=>uv\u009d\u00a4\u00a8\u00a9\u00e5\u00e6\u012a\u012b"+
		"\u0131\u0132\u0006\u0000==uu\u00a1\u00a1\u00a3\u00a3\u00e5\u00e5\u0131"+
		"\u0131\u0002\u0000\u00a3\u00a3\u0131\u0131\u0004\u0000==uu\u00a1\u00a1"+
		"\u00e5\u00e5\u0003\u0000uu\u00a1\u00a1\u00e5\u00e5\u0002\u0000PP\u00be"+
		"\u00be\u0002\u0000\u00b6\u00b6\u00f5\u00f5\u0002\u0000ff\u00c7\u00c7\u0001"+
		"\u0000\u0150\u0151\u0002\u0000RR\u00ef\u00ef3\u0000\b\t\u000b\r\u000f"+
		"\u000f\u0011\u0013\u0015\u0016\u0018\u0018\u001a\u001e!#%(**,24478=NP"+
		"RVVX_bbdfijmpssuy{}\u007f\u0081\u0083\u0083\u0086\u0086\u0088\u0089\u008b"+
		"\u008b\u008e\u00a9\u00ab\u00ab\u00ae\u00af\u00b3\u00b4\u00b7\u00b7\u00b9"+
		"\u00ba\u00bc\u00c0\u00c3\u00c7\u00c9\u00d2\u00d4\u00dc\u00de\u00e8\u00ea"+
		"\u00ed\u00ef\u00f3\u00f5\u0101\u0103\u0108\u010b\u010d\u010f\u010f\u0111"+
		"\u011b\u011f\u0123\u0126\u012b\u012e\u012e\u0131\u0133\u0010\u0000\u000f"+
		"\u000f66WWll~~\u0082\u0082\u0087\u0087\u008a\u008a\u008d\u008d\u00aa\u00aa"+
		"\u00b1\u00b1\u00dd\u00dd\u00ea\u00ea\u00f0\u00f0\u011c\u011c\u0125\u0125"+
		"\u0011\u0000\b\u000e\u001057VXkm}\u007f\u0081\u0083\u0086\u0088\u0089"+
		"\u008b\u008c\u008e\u00a9\u00ab\u00b0\u00b2\u00dc\u00de\u00e9\u00eb\u00ef"+
		"\u00f1\u011b\u011d\u0124\u0126\u0133\u1005\u0000\u015c\u0001\u0000\u0000"+
		"\u0000\u0002\u0165\u0001\u0000\u0000\u0000\u0004\u0168\u0001\u0000\u0000"+
		"\u0000\u0006\u016b\u0001\u0000\u0000\u0000\b\u016e\u0001\u0000\u0000\u0000"+
		"\n\u0171\u0001\u0000\u0000\u0000\f\u0174\u0001\u0000\u0000\u0000\u000e"+
		"\u049a\u0001\u0000\u0000\u0000\u0010\u049e\u0001\u0000\u0000\u0000\u0012"+
		"\u04a0\u0001\u0000\u0000\u0000\u0014\u04a2\u0001\u0000\u0000\u0000\u0016"+
		"\u054c\u0001\u0000\u0000\u0000\u0018\u054e\u0001\u0000\u0000\u0000\u001a"+
		"\u055f\u0001\u0000\u0000\u0000\u001c\u0565\u0001\u0000\u0000\u0000\u001e"+
		"\u0571\u0001\u0000\u0000\u0000 \u057e\u0001\u0000\u0000\u0000\"\u0581"+
		"\u0001\u0000\u0000\u0000$\u0585\u0001\u0000\u0000\u0000&\u05d0\u0001\u0000"+
		"\u0000\u0000(\u05d2\u0001\u0000\u0000\u0000*\u05d6\u0001\u0000\u0000\u0000"+
		",\u05eb\u0001\u0000\u0000\u0000.\u05ed\u0001\u0000\u0000\u00000\u05ef"+
		"\u0001\u0000\u0000\u00002\u05f6\u0001\u0000\u0000\u00004\u05f8\u0001\u0000"+
		"\u0000\u00006\u0600\u0001\u0000\u0000\u00008\u0609\u0001\u0000\u0000\u0000"+
		":\u0614\u0001\u0000\u0000\u0000<\u0626\u0001\u0000\u0000\u0000>\u0629"+
		"\u0001\u0000\u0000\u0000@\u0634\u0001\u0000\u0000\u0000B\u0644\u0001\u0000"+
		"\u0000\u0000D\u064a\u0001\u0000\u0000\u0000F\u064c\u0001\u0000\u0000\u0000"+
		"H\u0657\u0001\u0000\u0000\u0000J\u0668\u0001\u0000\u0000\u0000L\u0670"+
		"\u0001\u0000\u0000\u0000N\u0672\u0001\u0000\u0000\u0000P\u0678\u0001\u0000"+
		"\u0000\u0000R\u06b3\u0001\u0000\u0000\u0000T\u06bf\u0001\u0000\u0000\u0000"+
		"V\u06f3\u0001\u0000\u0000\u0000X\u06f6\u0001\u0000\u0000\u0000Z\u071c"+
		"\u0001\u0000\u0000\u0000\\\u071e\u0001\u0000\u0000\u0000^\u0726\u0001"+
		"\u0000\u0000\u0000`\u0747\u0001\u0000\u0000\u0000b\u0775\u0001\u0000\u0000"+
		"\u0000d\u078a\u0001\u0000\u0000\u0000f\u07aa\u0001\u0000\u0000\u0000h"+
		"\u07b6\u0001\u0000\u0000\u0000j\u07b9\u0001\u0000\u0000\u0000l\u07c2\u0001"+
		"\u0000\u0000\u0000n\u07d0\u0001\u0000\u0000\u0000p\u07e3\u0001\u0000\u0000"+
		"\u0000r\u07f7\u0001\u0000\u0000\u0000t\u07fd\u0001\u0000\u0000\u0000v"+
		"\u07ff\u0001\u0000\u0000\u0000x\u0807\u0001\u0000\u0000\u0000z\u080b\u0001"+
		"\u0000\u0000\u0000|\u080e\u0001\u0000\u0000\u0000~\u0811\u0001\u0000\u0000"+
		"\u0000\u0080\u082b\u0001\u0000\u0000\u0000\u0082\u082d\u0001\u0000\u0000"+
		"\u0000\u0084\u0850\u0001\u0000\u0000\u0000\u0086\u0879\u0001\u0000\u0000"+
		"\u0000\u0088\u087d\u0001\u0000\u0000\u0000\u008a\u0898\u0001\u0000\u0000"+
		"\u0000\u008c\u089c\u0001\u0000\u0000\u0000\u008e\u08ab\u0001\u0000\u0000"+
		"\u0000\u0090\u08ad\u0001\u0000\u0000\u0000\u0092\u08cb\u0001\u0000\u0000"+
		"\u0000\u0094\u08cd\u0001\u0000\u0000\u0000\u0096\u08d4\u0001\u0000\u0000"+
		"\u0000\u0098\u08e1\u0001\u0000\u0000\u0000\u009a\u08e6\u0001\u0000\u0000"+
		"\u0000\u009c\u08e8\u0001\u0000\u0000\u0000\u009e\u08f7\u0001\u0000\u0000"+
		"\u0000\u00a0\u090f\u0001\u0000\u0000\u0000\u00a2\u091c\u0001\u0000\u0000"+
		"\u0000\u00a4\u091e\u0001\u0000\u0000\u0000\u00a6\u0920\u0001\u0000\u0000"+
		"\u0000\u00a8\u0924\u0001\u0000\u0000\u0000\u00aa\u0927\u0001\u0000\u0000"+
		"\u0000\u00ac\u092b\u0001\u0000\u0000\u0000\u00ae\u094b\u0001\u0000\u0000"+
		"\u0000\u00b0\u094e\u0001\u0000\u0000\u0000\u00b2\u095a\u0001\u0000\u0000"+
		"\u0000\u00b4\u096d\u0001\u0000\u0000\u0000\u00b6\u0987\u0001\u0000\u0000"+
		"\u0000\u00b8\u098d\u0001\u0000\u0000\u0000\u00ba\u098f\u0001\u0000\u0000"+
		"\u0000\u00bc\u09b3\u0001\u0000\u0000\u0000\u00be\u09b5\u0001\u0000\u0000"+
		"\u0000\u00c0\u09b9\u0001\u0000\u0000\u0000\u00c2\u09c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u09cc\u0001\u0000\u0000\u0000\u00c6\u09d0\u0001\u0000\u0000"+
		"\u0000\u00c8\u09db\u0001\u0000\u0000\u0000\u00ca\u09fa\u0001\u0000\u0000"+
		"\u0000\u00cc\u09fc\u0001\u0000\u0000\u0000\u00ce\u0a07\u0001\u0000\u0000"+
		"\u0000\u00d0\u0a1d\u0001\u0000\u0000\u0000\u00d2\u0a50\u0001\u0000\u0000"+
		"\u0000\u00d4\u0a52\u0001\u0000\u0000\u0000\u00d6\u0a5a\u0001\u0000\u0000"+
		"\u0000\u00d8\u0a62\u0001\u0000\u0000\u0000\u00da\u0a6a\u0001\u0000\u0000"+
		"\u0000\u00dc\u0a72\u0001\u0000\u0000\u0000\u00de\u0a79\u0001\u0000\u0000"+
		"\u0000\u00e0\u0a7d\u0001\u0000\u0000\u0000\u00e2\u0a87\u0001\u0000\u0000"+
		"\u0000\u00e4\u0a8f\u0001\u0000\u0000\u0000\u00e6\u0a9c\u0001\u0000\u0000"+
		"\u0000\u00e8\u0aab\u0001\u0000\u0000\u0000\u00ea\u0aaf\u0001\u0000\u0000"+
		"\u0000\u00ec\u0ab1\u0001\u0000\u0000\u0000\u00ee\u0ab3\u0001\u0000\u0000"+
		"\u0000\u00f0\u0ac7\u0001\u0000\u0000\u0000\u00f2\u0b26\u0001\u0000\u0000"+
		"\u0000\u00f4\u0b2c\u0001\u0000\u0000\u0000\u00f6\u0b46\u0001\u0000\u0000"+
		"\u0000\u00f8\u0c36\u0001\u0000\u0000\u0000\u00fa\u0c53\u0001\u0000\u0000"+
		"\u0000\u00fc\u0c55\u0001\u0000\u0000\u0000\u00fe\u0c57\u0001\u0000\u0000"+
		"\u0000\u0100\u0c59\u0001\u0000\u0000\u0000\u0102\u0c5b\u0001\u0000\u0000"+
		"\u0000\u0104\u0c5d\u0001\u0000\u0000\u0000\u0106\u0c62\u0001\u0000\u0000"+
		"\u0000\u0108\u0c69\u0001\u0000\u0000\u0000\u010a\u0c6d\u0001\u0000\u0000"+
		"\u0000\u010c\u0c72\u0001\u0000\u0000\u0000\u010e\u0c78\u0001\u0000\u0000"+
		"\u0000\u0110\u0c7f\u0001\u0000\u0000\u0000\u0112\u0c81\u0001\u0000\u0000"+
		"\u0000\u0114\u0c86\u0001\u0000\u0000\u0000\u0116\u0cb6\u0001\u0000\u0000"+
		"\u0000\u0118\u0cb8\u0001\u0000\u0000\u0000\u011a\u0cc0\u0001\u0000\u0000"+
		"\u0000\u011c\u0ccf\u0001\u0000\u0000\u0000\u011e\u0cd2\u0001\u0000\u0000"+
		"\u0000\u0120\u0cda\u0001\u0000\u0000\u0000\u0122\u0ce3\u0001\u0000\u0000"+
		"\u0000\u0124\u0ceb\u0001\u0000\u0000\u0000\u0126\u0cf8\u0001\u0000\u0000"+
		"\u0000\u0128\u0cfa\u0001\u0000\u0000\u0000\u012a\u0d01\u0001\u0000\u0000"+
		"\u0000\u012c\u0d09\u0001\u0000\u0000\u0000\u012e\u0d15\u0001\u0000\u0000"+
		"\u0000\u0130\u0d1a\u0001\u0000\u0000\u0000\u0132\u0d23\u0001\u0000\u0000"+
		"\u0000\u0134\u0d55\u0001\u0000\u0000\u0000\u0136\u0d67\u0001\u0000\u0000"+
		"\u0000\u0138\u0d70\u0001\u0000\u0000\u0000\u013a\u0d72\u0001\u0000\u0000"+
		"\u0000\u013c\u0d7e\u0001\u0000\u0000\u0000\u013e\u0d80\u0001\u0000\u0000"+
		"\u0000\u0140\u0d88\u0001\u0000\u0000\u0000\u0142\u0d92\u0001\u0000\u0000"+
		"\u0000\u0144\u0d97\u0001\u0000\u0000\u0000\u0146\u0d9f\u0001\u0000\u0000"+
		"\u0000\u0148\u0da4\u0001\u0000\u0000\u0000\u014a\u0da6\u0001\u0000\u0000"+
		"\u0000\u014c\u0dd3\u0001\u0000\u0000\u0000\u014e\u0de0\u0001\u0000\u0000"+
		"\u0000\u0150\u0de5\u0001\u0000\u0000\u0000\u0152\u0de9\u0001\u0000\u0000"+
		"\u0000\u0154\u0ded\u0001\u0000\u0000\u0000\u0156\u0def\u0001\u0000\u0000"+
		"\u0000\u0158\u0df1\u0001\u0000\u0000\u0000\u015a\u0df3\u0001\u0000\u0000"+
		"\u0000\u015c\u0160\u0003\u000e\u0007\u0000\u015d\u015f\u0005\u0001\u0000"+
		"\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0005\u0000\u0000\u0001\u0164\u0001\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0003\u00e0p\u0000\u0166\u0167\u0005\u0000\u0000\u0001"+
		"\u0167\u0003\u0001\u0000\u0000\u0000\u0168\u0169\u0003\u00dcn\u0000\u0169"+
		"\u016a\u0005\u0000\u0000\u0001\u016a\u0005\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0003\u00d6k\u0000\u016c\u016d\u0005\u0000\u0000\u0001\u016d\u0007"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0003\u00deo\u0000\u016f\u0170\u0005"+
		"\u0000\u0000\u0001\u0170\t\u0001\u0000\u0000\u0000\u0171\u0172\u0003\u0116"+
		"\u008b\u0000\u0172\u0173\u0005\u0000\u0000\u0001\u0173\u000b\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0003\u011e\u008f\u0000\u0175\u0176\u0005\u0000"+
		"\u0000\u0001\u0176\r\u0001\u0000\u0000\u0000\u0177\u049b\u0003$\u0012"+
		"\u0000\u0178\u017a\u00036\u001b\u0000\u0179\u0178\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u049b\u0003R)\u0000\u017c\u017d\u0005\u0123\u0000\u0000\u017d\u049b"+
		"\u0003\u00d6k\u0000\u017e\u017f\u0005\u0123\u0000\u0000\u017f\u0180\u0003"+
		".\u0017\u0000\u0180\u0181\u0003\u00d6k\u0000\u0181\u049b\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0005\u00ef\u0000\u0000\u0183\u0186\u0005!\u0000\u0000"+
		"\u0184\u0187\u0003\u0144\u00a2\u0000\u0185\u0187\u0003\u0150\u00a8\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u049b\u0001\u0000\u0000\u0000\u0188\u0189\u00055\u0000\u0000\u0189"+
		"\u018d\u0003.\u0017\u0000\u018a\u018b\u0005w\u0000\u0000\u018b\u018c\u0005"+
		"\u00ac\u0000\u0000\u018c\u018e\u0005Z\u0000\u0000\u018d\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000"+
		"\u0000\u0000\u018f\u0197\u0003\u00d6k\u0000\u0190\u0196\u0003\"\u0011"+
		"\u0000\u0191\u0196\u0003 \u0010\u0000\u0192\u0193\u0005\u012f\u0000\u0000"+
		"\u0193\u0194\u0007\u0000\u0000\u0000\u0194\u0196\u0003>\u001f\u0000\u0195"+
		"\u0190\u0001\u0000\u0000\u0000\u0195\u0191\u0001\u0000\u0000\u0000\u0195"+
		"\u0192\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198"+
		"\u049b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0005\u000b\u0000\u0000\u019b\u019c\u0003.\u0017\u0000\u019c\u019d"+
		"\u0003\u00d6k\u0000\u019d\u019e\u0005\u00ef\u0000\u0000\u019e\u019f\u0007"+
		"\u0000\u0000\u0000\u019f\u01a0\u0003>\u001f\u0000\u01a0\u049b\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0005\u000b\u0000\u0000\u01a2\u01a3\u0003.\u0017"+
		"\u0000\u01a3\u01a4\u0003\u00d6k\u0000\u01a4\u01a5\u0005\u00ef\u0000\u0000"+
		"\u01a5\u01a6\u0003 \u0010\u0000\u01a6\u049b\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0005R\u0000\u0000\u01a8\u01ab\u0003.\u0017\u0000\u01a9\u01aa\u0005"+
		"w\u0000\u0000\u01aa\u01ac\u0005Z\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01af\u0003\u00d6k\u0000\u01ae\u01b0\u0007\u0001\u0000\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u049b\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u00f2\u0000\u0000"+
		"\u01b2\u01b5\u00030\u0018\u0000\u01b3\u01b4\u0007\u0002\u0000\u0000\u01b4"+
		"\u01b6\u0003\u00d6k\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6\u01bb\u0001\u0000\u0000\u0000\u01b7\u01b9"+
		"\u0005\u008e\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc"+
		"\u0003\u0150\u00a8\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bc\u049b\u0001\u0000\u0000\u0000\u01bd\u01c2"+
		"\u0003\u0018\f\u0000\u01be\u01bf\u0005\u0002\u0000\u0000\u01bf\u01c0\u0003"+
		"\u0122\u0091\u0000\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c2\u01be\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003"+
		":\u001d\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01cc\u0003<\u001e"+
		"\u0000\u01c8\u01ca\u0005\u0014\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cd\u0003$\u0012\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u049b\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u00055\u0000\u0000\u01cf\u01d3\u0005\u0102\u0000\u0000\u01d0"+
		"\u01d1\u0005w\u0000\u0000\u01d1\u01d2\u0005\u00ac\u0000\u0000\u01d2\u01d4"+
		"\u0005Z\u0000\u0000\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0003"+
		"\u00dcn\u0000\u01d6\u01d7\u0005\u008e\u0000\u0000\u01d7\u01e0\u0003\u00dc"+
		"n\u0000\u01d8\u01df\u0003:\u001d\u0000\u01d9\u01df\u0003\u00d2i\u0000"+
		"\u01da\u01df\u0003J%\u0000\u01db\u01df\u0003 \u0010\u0000\u01dc\u01dd"+
		"\u0005\u0106\u0000\u0000\u01dd\u01df\u0003>\u001f\u0000\u01de\u01d8\u0001"+
		"\u0000\u0000\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de\u01da\u0001"+
		"\u0000\u0000\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u049b\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e8\u0003"+
		"\u001a\r\u0000\u01e4\u01e5\u0005\u0002\u0000\u0000\u01e5\u01e6\u0003\u0122"+
		"\u0091\u0000\u01e6\u01e7\u0005\u0003\u0000\u0000\u01e7\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e4\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01ec\u0003:\u001d"+
		"\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f2\u0003<\u001e\u0000"+
		"\u01ee\u01f0\u0005\u0014\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u0003$\u0012\u0000\u01f2\u01ef\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u049b\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0005\r\u0000\u0000\u01f5\u01f6\u0005\u0102\u0000\u0000\u01f6\u01f8"+
		"\u0003\u00d6k\u0000\u01f7\u01f9\u0003*\u0015\u0000\u01f8\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u00051\u0000\u0000\u01fb\u0203\u0005\u00f9\u0000"+
		"\u0000\u01fc\u0204\u0003\u0144\u00a2\u0000\u01fd\u01fe\u0005g\u0000\u0000"+
		"\u01fe\u01ff\u0005,\u0000\u0000\u01ff\u0204\u0003\u00c0`\u0000\u0200\u0201"+
		"\u0005g\u0000\u0000\u0201\u0202\u0005\n\u0000\u0000\u0202\u0204\u0005"+
		",\u0000\u0000\u0203\u01fc\u0001\u0000\u0000\u0000\u0203\u01fd\u0001\u0000"+
		"\u0000\u0000\u0203\u0200\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000"+
		"\u0000\u0000\u0204\u049b\u0001\u0000\u0000\u0000\u0205\u0206\u0005\r\u0000"+
		"\u0000\u0206\u0209\u0005\u0103\u0000\u0000\u0207\u0208\u0007\u0002\u0000"+
		"\u0000\u0208\u020a\u0003\u00d6k\u0000\u0209\u0207\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u00051\u0000\u0000\u020c\u020e\u0005\u00f9\u0000\u0000\u020d"+
		"\u020f\u0003\u0144\u00a2\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u049b\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0005\u000b\u0000\u0000\u0211\u0212\u0005\u0102\u0000\u0000\u0212"+
		"\u0213\u0003\u00d6k\u0000\u0213\u0214\u0005\b\u0000\u0000\u0214\u0215"+
		"\u0007\u0003\u0000\u0000\u0215\u0216\u0003\u0118\u008c\u0000\u0216\u049b"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u000b\u0000\u0000\u0218\u0219"+
		"\u0005\u0102\u0000\u0000\u0219\u021a\u0003\u00d6k\u0000\u021a\u021b\u0005"+
		"\b\u0000\u0000\u021b\u021c\u0007\u0003\u0000\u0000\u021c\u021d\u0005\u0002"+
		"\u0000\u0000\u021d\u021e\u0003\u0118\u008c\u0000\u021e\u021f\u0005\u0003"+
		"\u0000\u0000\u021f\u049b\u0001\u0000\u0000\u0000\u0220\u0221\u0005\u000b"+
		"\u0000\u0000\u0221\u0222\u0005\u0102\u0000\u0000\u0222\u0223\u0003\u00d6"+
		"k\u0000\u0223\u0224\u0005\u00d5\u0000\u0000\u0224\u0225\u0005+\u0000\u0000"+
		"\u0225\u0226\u0003\u00d6k\u0000\u0226\u0227\u0005\u010e\u0000\u0000\u0227"+
		"\u0228\u0003\u0140\u00a0\u0000\u0228\u049b\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0005\u000b\u0000\u0000\u022a\u022b\u0005\u0102\u0000\u0000\u022b"+
		"\u022c\u0003\u00d6k\u0000\u022c\u022d\u0005R\u0000\u0000\u022d\u0230\u0007"+
		"\u0003\u0000\u0000\u022e\u022f\u0005w\u0000\u0000\u022f\u0231\u0005Z\u0000"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0005\u0002\u0000"+
		"\u0000\u0233\u0234\u0003\u00d4j\u0000\u0234\u0235\u0005\u0003\u0000\u0000"+
		"\u0235\u049b\u0001\u0000\u0000\u0000\u0236\u0237\u0005\u000b\u0000\u0000"+
		"\u0237\u0238\u0005\u0102\u0000\u0000\u0238\u0239\u0003\u00d6k\u0000\u0239"+
		"\u023a\u0005R\u0000\u0000\u023a\u023d\u0007\u0003\u0000\u0000\u023b\u023c"+
		"\u0005w\u0000\u0000\u023c\u023e\u0005Z\u0000\u0000\u023d\u023b\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0003\u00d4j\u0000\u0240\u049b\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0005\u000b\u0000\u0000\u0242\u0243\u0007\u0004\u0000"+
		"\u0000\u0243\u0244\u0003\u00d6k\u0000\u0244\u0245\u0005\u00d5\u0000\u0000"+
		"\u0245\u0246\u0005\u010e\u0000\u0000\u0246\u0247\u0003\u00d6k\u0000\u0247"+
		"\u049b\u0001\u0000\u0000\u0000\u0248\u0249\u0005\u000b\u0000\u0000\u0249"+
		"\u024a\u0007\u0004\u0000\u0000\u024a\u024b\u0003\u00d6k\u0000\u024b\u024c"+
		"\u0005\u00ef\u0000\u0000\u024c\u024d\u0005\u0106\u0000\u0000\u024d\u024e"+
		"\u0003>\u001f\u0000\u024e\u049b\u0001\u0000\u0000\u0000\u024f\u0250\u0005"+
		"\u000b\u0000\u0000\u0250\u0251\u0007\u0004\u0000\u0000\u0251\u0252\u0003"+
		"\u00d6k\u0000\u0252\u0253\u0005\u0121\u0000\u0000\u0253\u0256\u0005\u0106"+
		"\u0000\u0000\u0254\u0255\u0005w\u0000\u0000\u0255\u0257\u0005Z\u0000\u0000"+
		"\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000"+
		"\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0003>\u001f\u0000\u0259"+
		"\u049b\u0001\u0000\u0000\u0000\u025a\u025b\u0005\u000b\u0000\u0000\u025b"+
		"\u025c\u0005\u0102\u0000\u0000\u025c\u025d\u0003\u00d6k\u0000\u025d\u025f"+
		"\u0007\u0005\u0000\u0000\u025e\u0260\u0005+\u0000\u0000\u025f\u025e\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001"+
		"\u0000\u0000\u0000\u0261\u0263\u0003\u00d6k\u0000\u0262\u0264\u0003\u014e"+
		"\u00a7\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000"+
		"\u0000\u0000\u0264\u049b\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u000b"+
		"\u0000\u0000\u0266\u0267\u0005\u0102\u0000\u0000\u0267\u0269\u0003\u00d6"+
		"k\u0000\u0268\u026a\u0003*\u0015\u0000\u0269\u0268\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000"+
		"\u026b\u026d\u0005#\u0000\u0000\u026c\u026e\u0005+\u0000\u0000\u026d\u026c"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0003\u00d6k\u0000\u0270\u0272\u0003"+
		"\u0120\u0090\u0000\u0271\u0273\u0003\u0114\u008a\u0000\u0272\u0271\u0001"+
		"\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u049b\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0005\u000b\u0000\u0000\u0275\u0276\u0005"+
		"\u0102\u0000\u0000\u0276\u0278\u0003\u00d6k\u0000\u0277\u0279\u0003*\u0015"+
		"\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027b\u0005\u00d8\u0000"+
		"\u0000\u027b\u027c\u0005,\u0000\u0000\u027c\u027d\u0005\u0002\u0000\u0000"+
		"\u027d\u027e\u0003\u0118\u008c\u0000\u027e\u027f\u0005\u0003\u0000\u0000"+
		"\u027f\u049b\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u000b\u0000\u0000"+
		"\u0281\u0282\u0005\u0102\u0000\u0000\u0282\u0284\u0003\u00d6k\u0000\u0283"+
		"\u0285\u0003*\u0015\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0005\u00ef\u0000\u0000\u0287\u0288\u0005\u00ec\u0000\u0000\u0288\u028c"+
		"\u0003\u0150\u00a8\u0000\u0289\u028a\u0005\u012f\u0000\u0000\u028a\u028b"+
		"\u0005\u00ed\u0000\u0000\u028b\u028d\u0003>\u001f\u0000\u028c\u0289\u0001"+
		"\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u049b\u0001"+
		"\u0000\u0000\u0000\u028e\u028f\u0005\u000b\u0000\u0000\u028f\u0290\u0005"+
		"\u0102\u0000\u0000\u0290\u0292\u0003\u00d6k\u0000\u0291\u0293\u0003*\u0015"+
		"\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0005\u00ef\u0000"+
		"\u0000\u0295\u0296\u0005\u00ed\u0000\u0000\u0296\u0297\u0003>\u001f\u0000"+
		"\u0297\u049b\u0001\u0000\u0000\u0000\u0298\u0299\u0005\u000b\u0000\u0000"+
		"\u0299\u029a\u0007\u0004\u0000\u0000\u029a\u029b\u0003\u00d6k\u0000\u029b"+
		"\u029f\u0005\b\u0000\u0000\u029c\u029d\u0005w\u0000\u0000\u029d\u029e"+
		"\u0005\u00ac\u0000\u0000\u029e\u02a0\u0005Z\u0000\u0000\u029f\u029c\u0001"+
		"\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a1\u02a3\u0003(\u0014\u0000\u02a2\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u049b\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0005\u000b\u0000\u0000\u02a7\u02a8\u0005\u0102"+
		"\u0000\u0000\u02a8\u02a9\u0003\u00d6k\u0000\u02a9\u02aa\u0003*\u0015\u0000"+
		"\u02aa\u02ab\u0005\u00d5\u0000\u0000\u02ab\u02ac\u0005\u010e\u0000\u0000"+
		"\u02ac\u02ad\u0003*\u0015\u0000\u02ad\u049b\u0001\u0000\u0000\u0000\u02ae"+
		"\u02af\u0005\u000b\u0000\u0000\u02af\u02b0\u0007\u0004\u0000\u0000\u02b0"+
		"\u02b1\u0003\u00d6k\u0000\u02b1\u02b4\u0005R\u0000\u0000\u02b2\u02b3\u0005"+
		"w\u0000\u0000\u02b3\u02b5\u0005Z\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b6\u02bb\u0003*\u0015\u0000\u02b7\u02b8\u0005\u0004\u0000\u0000"+
		"\u02b8\u02ba\u0003*\u0015\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000\u02bd"+
		"\u02bb\u0001\u0000\u0000\u0000\u02be\u02c0\u0005\u00cb\u0000\u0000\u02bf"+
		"\u02be\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0"+
		"\u049b\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005\u000b\u0000\u0000\u02c2"+
		"\u02c3\u0005\u0102\u0000\u0000\u02c3\u02c5\u0003\u00d6k\u0000\u02c4\u02c6"+
		"\u0003*\u0015\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005"+
		"\u00ef\u0000\u0000\u02c8\u02c9\u0003 \u0010\u0000\u02c9\u049b\u0001\u0000"+
		"\u0000\u0000\u02ca\u02cb\u0005\u000b\u0000\u0000\u02cb\u02cc\u0005\u0102"+
		"\u0000\u0000\u02cc\u02cd\u0003\u00d6k\u0000\u02cd\u02ce\u0005\u00d1\u0000"+
		"\u0000\u02ce\u02cf\u0005\u00c0\u0000\u0000\u02cf\u049b\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0005R\u0000\u0000\u02d1\u02d4\u0005\u0102\u0000\u0000"+
		"\u02d2\u02d3\u0005w\u0000\u0000\u02d3\u02d5\u0005Z\u0000\u0000\u02d4\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d8\u0003\u00d6k\u0000\u02d7\u02d9\u0005"+
		"\u00cb\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001"+
		"\u0000\u0000\u0000\u02d9\u049b\u0001\u0000\u0000\u0000\u02da\u02db\u0005"+
		"R\u0000\u0000\u02db\u02de\u0005\u0128\u0000\u0000\u02dc\u02dd\u0005w\u0000"+
		"\u0000\u02dd\u02df\u0005Z\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e0\u049b\u0003\u00d6k\u0000\u02e1\u02e4\u00055\u0000\u0000\u02e2\u02e3"+
		"\u0005\u00b5\u0000\u0000\u02e3\u02e5\u0005\u00d8\u0000\u0000\u02e4\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02ea"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e8\u0005p\u0000\u0000\u02e7\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001"+
		"\u0000\u0000\u0000\u02e9\u02eb\u0005\u0107\u0000\u0000\u02ea\u02e7\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ec\u02f0\u0005\u0128\u0000\u0000\u02ed\u02ee\u0005"+
		"w\u0000\u0000\u02ee\u02ef\u0005\u00ac\u0000\u0000\u02ef\u02f1\u0005Z\u0000"+
		"\u0000\u02f0\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f4\u0003\u00d6k\u0000"+
		"\u02f3\u02f5\u0003\u00c6c\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f5\u02fe\u0001\u0000\u0000\u0000\u02f6"+
		"\u02fd\u0003\"\u0011\u0000\u02f7\u02f8\u0005\u00bf\u0000\u0000\u02f8\u02f9"+
		"\u0005\u00b1\u0000\u0000\u02f9\u02fd\u0003\u00be_\u0000\u02fa\u02fb\u0005"+
		"\u0106\u0000\u0000\u02fb\u02fd\u0003>\u001f\u0000\u02fc\u02f6\u0001\u0000"+
		"\u0000\u0000\u02fc\u02f7\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000"+
		"\u0000\u0000\u02fd\u0300\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0301\u0001\u0000"+
		"\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0301\u0302\u0005\u0014"+
		"\u0000\u0000\u0302\u0303\u0003$\u0012\u0000\u0303\u049b\u0001\u0000\u0000"+
		"\u0000\u0304\u0307\u00055\u0000\u0000\u0305\u0306\u0005\u00b5\u0000\u0000"+
		"\u0306\u0308\u0005\u00d8\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030a\u0001\u0000\u0000\u0000"+
		"\u0309\u030b\u0005p\u0000\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0005\u0107\u0000\u0000\u030d\u030e\u0005\u0128\u0000\u0000\u030e"+
		"\u0313\u0003\u00dcn\u0000\u030f\u0310\u0005\u0002\u0000\u0000\u0310\u0311"+
		"\u0003\u011e\u008f\u0000\u0311\u0312\u0005\u0003\u0000\u0000\u0312\u0314"+
		"\u0001\u0000\u0000\u0000\u0313\u030f\u0001\u0000\u0000\u0000\u0313\u0314"+
		"\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0318"+
		"\u0003:\u001d\u0000\u0316\u0317\u0005\u00b4\u0000\u0000\u0317\u0319\u0003"+
		">\u001f\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000"+
		"\u0000\u0000\u0319\u049b\u0001\u0000\u0000\u0000\u031a\u031b\u0005\u000b"+
		"\u0000\u0000\u031b\u031c\u0005\u0128\u0000\u0000\u031c\u031e\u0003\u00d6"+
		"k\u0000\u031d\u031f\u0005\u0014\u0000\u0000\u031e\u031d\u0001\u0000\u0000"+
		"\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0003$\u0012\u0000\u0321\u049b\u0001\u0000\u0000\u0000"+
		"\u0322\u0325\u00055\u0000\u0000\u0323\u0324\u0005\u00b5\u0000\u0000\u0324"+
		"\u0326\u0005\u00d8\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325"+
		"\u0326\u0001\u0000\u0000\u0000\u0326\u0328\u0001\u0000\u0000\u0000\u0327"+
		"\u0329\u0005\u0107\u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328"+
		"\u0329\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a"+
		"\u032e\u0005m\u0000\u0000\u032b\u032c\u0005w\u0000\u0000\u032c\u032d\u0005"+
		"\u00ac\u0000\u0000\u032d\u032f\u0005Z\u0000\u0000\u032e\u032b\u0001\u0000"+
		"\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000"+
		"\u0000\u0000\u0330\u0331\u0003\u00d6k\u0000\u0331\u0332\u0005\u0014\u0000"+
		"\u0000\u0332\u033c\u0003\u0150\u00a8\u0000\u0333\u0334\u0005\u0125\u0000"+
		"\u0000\u0334\u0339\u0003P(\u0000\u0335\u0336\u0005\u0004\u0000\u0000\u0336"+
		"\u0338\u0003P(\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u033b\u0001"+
		"\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339\u033a\u0001"+
		"\u0000\u0000\u0000\u033a\u033d\u0001\u0000\u0000\u0000\u033b\u0339\u0001"+
		"\u0000\u0000\u0000\u033c\u0333\u0001\u0000\u0000\u0000\u033c\u033d\u0001"+
		"\u0000\u0000\u0000\u033d\u049b\u0001\u0000\u0000\u0000\u033e\u0340\u0005"+
		"R\u0000\u0000\u033f\u0341\u0005\u0107\u0000\u0000\u0340\u033f\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000"+
		"\u0000\u0000\u0342\u0345\u0005m\u0000\u0000\u0343\u0344\u0005w\u0000\u0000"+
		"\u0344\u0346\u0005Z\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0345"+
		"\u0346\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347"+
		"\u049b\u0003\u00d6k\u0000\u0348\u034a\u0005[\u0000\u0000\u0349\u034b\u0007"+
		"\u0006\u0000\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001"+
		"\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u049b\u0003"+
		"\u000e\u0007\u0000\u034d\u034e\u0005\u00f2\u0000\u0000\u034e\u0351\u0005"+
		"\u0103\u0000\u0000\u034f\u0350\u0007\u0002\u0000\u0000\u0350\u0352\u0003"+
		"\u00d6k\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000"+
		"\u0000\u0000\u0352\u0357\u0001\u0000\u0000\u0000\u0353\u0355\u0005\u008e"+
		"\u0000\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000"+
		"\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0358\u0003\u0150"+
		"\u00a8\u0000\u0357\u0354\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000"+
		"\u0000\u0000\u0358\u049b\u0001\u0000\u0000\u0000\u0359\u035a\u0005\u00f2"+
		"\u0000\u0000\u035a\u035b\u0005\u0102\u0000\u0000\u035b\u035e\u0005]\u0000"+
		"\u0000\u035c\u035d\u0007\u0002\u0000\u0000\u035d\u035f\u0003\u00d6k\u0000"+
		"\u035e\u035c\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000"+
		"\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0361\u0005\u008e\u0000\u0000"+
		"\u0361\u0363\u0003\u0150\u00a8\u0000\u0362\u0364\u0003*\u0015\u0000\u0363"+
		"\u0362\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364"+
		"\u049b\u0001\u0000\u0000\u0000\u0365\u0366\u0005\u00f2\u0000\u0000\u0366"+
		"\u0367\u0005\u0106\u0000\u0000\u0367\u036c\u0003\u00d6k\u0000\u0368\u0369"+
		"\u0005\u0002\u0000\u0000\u0369\u036a\u0003B!\u0000\u036a\u036b\u0005\u0003"+
		"\u0000\u0000\u036b\u036d\u0001\u0000\u0000\u0000\u036c\u0368\u0001\u0000"+
		"\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u049b\u0001\u0000"+
		"\u0000\u0000\u036e\u036f\u0005\u00f2\u0000\u0000\u036f\u0370\u0005,\u0000"+
		"\u0000\u0370\u0371\u0007\u0002\u0000\u0000\u0371\u0374\u0003\u00d6k\u0000"+
		"\u0372\u0373\u0007\u0002\u0000\u0000\u0373\u0375\u0003\u00d6k\u0000\u0374"+
		"\u0372\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375"+
		"\u049b\u0001\u0000\u0000\u0000\u0376\u0377\u0005\u00f2\u0000\u0000\u0377"+
		"\u037a\u0005\u0129\u0000\u0000\u0378\u0379\u0007\u0002\u0000\u0000\u0379"+
		"\u037b\u0003\u00d6k\u0000\u037a\u0378\u0001\u0000\u0000\u0000\u037a\u037b"+
		"\u0001\u0000\u0000\u0000\u037b\u0380\u0001\u0000\u0000\u0000\u037c\u037e"+
		"\u0005\u008e\u0000\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e"+
		"\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0381"+
		"\u0003\u0150\u00a8\u0000\u0380\u037d\u0001\u0000\u0000\u0000\u0380\u0381"+
		"\u0001\u0000\u0000\u0000\u0381\u049b\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u0005\u00f2\u0000\u0000\u0383\u0384\u0005\u00c0\u0000\u0000\u0384\u0386"+
		"\u0003\u00d6k\u0000\u0385\u0387\u0003*\u0015\u0000\u0386\u0385\u0001\u0000"+
		"\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u049b\u0001\u0000"+
		"\u0000\u0000\u0388\u038a\u0005\u00f2\u0000\u0000\u0389\u038b\u0003\u0144"+
		"\u00a2\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000"+
		"\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038f\u0005n\u0000"+
		"\u0000\u038d\u038e\u0007\u0002\u0000\u0000\u038e\u0390\u0003\u00d6k\u0000"+
		"\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000"+
		"\u0390\u0398\u0001\u0000\u0000\u0000\u0391\u0393\u0005\u008e\u0000\u0000"+
		"\u0392\u0391\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000"+
		"\u0393\u0396\u0001\u0000\u0000\u0000\u0394\u0397\u0003\u00d6k\u0000\u0395"+
		"\u0397\u0003\u0150\u00a8\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0396"+
		"\u0395\u0001\u0000\u0000\u0000\u0397\u0399\u0001\u0000\u0000\u0000\u0398"+
		"\u0392\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399"+
		"\u049b\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u00f2\u0000\u0000\u039b"+
		"\u039c\u00055\u0000\u0000\u039c\u039d\u0005\u0102\u0000\u0000\u039d\u03a0"+
		"\u0003\u00d6k\u0000\u039e\u039f\u0005\u0014\u0000\u0000\u039f\u03a1\u0005"+
		"\u00ec\u0000\u0000\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a1\u049b\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005"+
		"\u00f2\u0000\u0000\u03a3\u03a4\u00058\u0000\u0000\u03a4\u049b\u0003.\u0017"+
		"\u0000\u03a5\u03a6\u0005\u00f2\u0000\u0000\u03a6\u03ab\u0005\"\u0000\u0000"+
		"\u03a7\u03a9\u0005\u008e\u0000\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000"+
		"\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000"+
		"\u03aa\u03ac\u0003\u0150\u00a8\u0000\u03ab\u03a8\u0001\u0000\u0000\u0000"+
		"\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u049b\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ae\u0007\u0007\u0000\u0000\u03ae\u03b0\u0005m\u0000\u0000\u03af"+
		"\u03b1\u0005]\u0000\u0000\u03b0\u03af\u0001\u0000\u0000\u0000\u03b0\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u049b"+
		"\u00032\u0019\u0000\u03b3\u03b4\u0007\u0007\u0000\u0000\u03b4\u03b6\u0003"+
		".\u0017\u0000\u03b5\u03b7\u0005]\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0003\u00d6k\u0000\u03b9\u049b\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bc\u0007\u0007\u0000\u0000\u03bb\u03bd\u0005\u0102\u0000\u0000"+
		"\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bd\u03bf\u0001\u0000\u0000\u0000\u03be\u03c0\u0007\b\u0000\u0000\u03bf"+
		"\u03be\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c3\u0003\u00d6k\u0000\u03c2\u03c4"+
		"\u0003*\u0015\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001"+
		"\u0000\u0000\u0000\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c7\u0003"+
		"4\u001a\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000"+
		"\u0000\u0000\u03c7\u049b\u0001\u0000\u0000\u0000\u03c8\u03ca\u0007\u0007"+
		"\u0000\u0000\u03c9\u03cb\u0005\u00cd\u0000\u0000\u03ca\u03c9\u0001\u0000"+
		"\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000"+
		"\u0000\u0000\u03cc\u049b\u0003$\u0012\u0000\u03cd\u03ce\u0005-\u0000\u0000"+
		"\u03ce\u03cf\u0005\u00b1\u0000\u0000\u03cf\u03d0\u0003.\u0017\u0000\u03d0"+
		"\u03d1\u0003\u00d6k\u0000\u03d1\u03d2\u0005\u0085\u0000\u0000\u03d2\u03d3"+
		"\u0003\u0152\u00a9\u0000\u03d3\u049b\u0001\u0000\u0000\u0000\u03d4\u03d5"+
		"\u0005-\u0000\u0000\u03d5\u03d6\u0005\u00b1\u0000\u0000\u03d6\u03d7\u0005"+
		"\u0102\u0000\u0000\u03d7\u03d8\u0003\u00d6k\u0000\u03d8\u03d9\u0005\u0085"+
		"\u0000\u0000\u03d9\u03da\u0003\u0152\u00a9\u0000\u03da\u049b\u0001\u0000"+
		"\u0000\u0000\u03db\u03dc\u0005\u00d4\u0000\u0000\u03dc\u03dd\u0005\u0102"+
		"\u0000\u0000\u03dd\u049b\u0003\u00d6k\u0000\u03de\u03df\u0005\u00d4\u0000"+
		"\u0000\u03df\u03e0\u0005m\u0000\u0000\u03e0\u049b\u0003\u00d6k\u0000\u03e1"+
		"\u03e9\u0005\u00d4\u0000\u0000\u03e2\u03ea\u0003\u0150\u00a8\u0000\u03e3"+
		"\u03e5\t\u0000\u0000\u0000\u03e4\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e8"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e6\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e7\u03ea\u0001\u0000\u0000\u0000\u03e8\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e9\u03e2\u0001\u0000\u0000\u0000\u03e9\u03e6"+
		"\u0001\u0000\u0000\u0000\u03ea\u049b\u0001\u0000\u0000\u0000\u03eb\u03ed"+
		"\u0005\u001d\u0000\u0000\u03ec\u03ee\u0005\u008b\u0000\u0000\u03ed\u03ec"+
		"\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005\u0102\u0000\u0000\u03f0\u03f3"+
		"\u0003\u00d6k\u0000\u03f1\u03f2\u0005\u00b4\u0000\u0000\u03f2\u03f4\u0003"+
		">\u001f\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f4\u03f9\u0001\u0000\u0000\u0000\u03f5\u03f7\u0005\u0014"+
		"\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03fa\u0003$\u0012"+
		"\u0000\u03f9\u03f6\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fa\u049b\u0001\u0000\u0000\u0000\u03fb\u03fc\u0005\u011b\u0000"+
		"\u0000\u03fc\u03ff\u0005\u0102\u0000\u0000\u03fd\u03fe\u0005w\u0000\u0000"+
		"\u03fe\u0400\u0005Z\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff"+
		"\u0400\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401"+
		"\u049b\u0003\u00d6k\u0000\u0402\u0403\u0005%\u0000\u0000\u0403\u049b\u0005"+
		"\u001d\u0000\u0000\u0404\u0405\u0005\u0093\u0000\u0000\u0405\u0407\u0005"+
		"@\u0000\u0000\u0406\u0408\u0005\u0094\u0000\u0000\u0407\u0406\u0001\u0000"+
		"\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000"+
		"\u0000\u0000\u0409\u040a\u0005\u007f\u0000\u0000\u040a\u040c\u0003\u0150"+
		"\u00a8\u0000\u040b\u040d\u0005\u00bd\u0000\u0000\u040c\u040b\u0001\u0000"+
		"\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000"+
		"\u0000\u0000\u040e\u040f\u0005\u0084\u0000\u0000\u040f\u0410\u0005\u0102"+
		"\u0000\u0000\u0410\u0412\u0003\u00d6k\u0000\u0411\u0413\u0003*\u0015\u0000"+
		"\u0412\u0411\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000\u0000\u0000"+
		"\u0413\u049b\u0001\u0000\u0000\u0000\u0414\u0415\u0005\u0116\u0000\u0000"+
		"\u0415\u0416\u0005\u0102\u0000\u0000\u0416\u0418\u0003\u00d6k\u0000\u0417"+
		"\u0419\u0003*\u0015\u0000\u0418\u0417\u0001\u0000\u0000\u0000\u0418\u0419"+
		"\u0001\u0000\u0000\u0000\u0419\u049b\u0001\u0000\u0000\u0000\u041a\u041c"+
		"\u0005\u00a5\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041b\u041c"+
		"\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041e"+
		"\u0005\u00d6\u0000\u0000\u041e\u041f\u0005\u0102\u0000\u0000\u041f\u0422"+
		"\u0003\u00d6k\u0000\u0420\u0421\u0007\t\u0000\u0000\u0421\u0423\u0005"+
		"\u00c0\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0423\u0001"+
		"\u0000\u0000\u0000\u0423\u049b\u0001\u0000\u0000\u0000\u0424\u0425\u0007"+
		"\n\u0000\u0000\u0425\u0429\u0003\u0144\u00a2\u0000\u0426\u0428\t\u0000"+
		"\u0000\u0000\u0427\u0426\u0001\u0000\u0000\u0000\u0428\u042b\u0001\u0000"+
		"\u0000\u0000\u0429\u042a\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000"+
		"\u0000\u0000\u042a\u049b\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000"+
		"\u0000\u0000\u042c\u042d\u0005\u00ef\u0000\u0000\u042d\u0431\u0005\u00df"+
		"\u0000\u0000\u042e\u0430\t\u0000\u0000\u0000\u042f\u042e\u0001\u0000\u0000"+
		"\u0000\u0430\u0433\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000"+
		"\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0432\u049b\u0001\u0000\u0000"+
		"\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0434\u0435\u0005\u00ef\u0000"+
		"\u0000\u0435\u0436\u0005\u010a\u0000\u0000\u0436\u0437\u0005\u0133\u0000"+
		"\u0000\u0437\u049b\u0003\u0104\u0082\u0000\u0438\u0439\u0005\u00ef\u0000"+
		"\u0000\u0439\u043a\u0005\u010a\u0000\u0000\u043a\u043b\u0005\u0133\u0000"+
		"\u0000\u043b\u049b\u0003\u0010\b\u0000\u043c\u043d\u0005\u00ef\u0000\u0000"+
		"\u043d\u043e\u0005\u010a\u0000\u0000\u043e\u0442\u0005\u0133\u0000\u0000"+
		"\u043f\u0441\t\u0000\u0000\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0441"+
		"\u0444\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0442"+
		"\u0440\u0001\u0000\u0000\u0000\u0443\u049b\u0001\u0000\u0000\u0000\u0444"+
		"\u0442\u0001\u0000\u0000\u0000\u0445\u0446\u0005\u00ef\u0000\u0000\u0446"+
		"\u0447\u0003\u0012\t\u0000\u0447\u0448\u0005\u0134\u0000\u0000\u0448\u0449"+
		"\u0003\u0014\n\u0000\u0449\u049b\u0001\u0000\u0000\u0000\u044a\u044b\u0005"+
		"\u00ef\u0000\u0000\u044b\u0453\u0003\u0012\t\u0000\u044c\u0450\u0005\u0134"+
		"\u0000\u0000\u044d\u044f\t\u0000\u0000\u0000\u044e\u044d\u0001\u0000\u0000"+
		"\u0000\u044f\u0452\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000"+
		"\u0000\u0450\u044e\u0001\u0000\u0000\u0000\u0451\u0454\u0001\u0000\u0000"+
		"\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0453\u044c\u0001\u0000\u0000"+
		"\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u049b\u0001\u0000\u0000"+
		"\u0000\u0455\u0459\u0005\u00ef\u0000\u0000\u0456\u0458\t\u0000\u0000\u0000"+
		"\u0457\u0456\u0001\u0000\u0000\u0000\u0458\u045b\u0001\u0000\u0000\u0000"+
		"\u0459\u045a\u0001\u0000\u0000\u0000\u0459\u0457\u0001\u0000\u0000\u0000"+
		"\u045a\u045c\u0001\u0000\u0000\u0000\u045b\u0459\u0001\u0000\u0000\u0000"+
		"\u045c\u045d\u0005\u0134\u0000\u0000\u045d\u049b\u0003\u0014\n\u0000\u045e"+
		"\u0462\u0005\u00ef\u0000\u0000\u045f\u0461\t\u0000\u0000\u0000\u0460\u045f"+
		"\u0001\u0000\u0000\u0000\u0461\u0464\u0001\u0000\u0000\u0000\u0462\u0463"+
		"\u0001\u0000\u0000\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0463\u049b"+
		"\u0001\u0000\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0465\u0466"+
		"\u0005\u00d9\u0000\u0000\u0466\u049b\u0003\u0012\t\u0000\u0467\u046b\u0005"+
		"\u00d9\u0000\u0000\u0468\u046a\t\u0000\u0000\u0000\u0469\u0468\u0001\u0000"+
		"\u0000\u0000\u046a\u046d\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000"+
		"\u0000\u0000\u046b\u0469\u0001\u0000\u0000\u0000\u046c\u049b\u0001\u0000"+
		"\u0000\u0000\u046d\u046b\u0001\u0000\u0000\u0000\u046e\u046f\u00055\u0000"+
		"\u0000\u046f\u0473\u0005|\u0000\u0000\u0470\u0471\u0005w\u0000\u0000\u0471"+
		"\u0472\u0005\u00ac\u0000\u0000\u0472\u0474\u0005Z\u0000\u0000\u0473\u0470"+
		"\u0001\u0000\u0000\u0000\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0475"+
		"\u0001\u0000\u0000\u0000\u0475\u0476\u0003\u0144\u00a2\u0000\u0476\u0478"+
		"\u0005\u00b1\u0000\u0000\u0477\u0479\u0005\u0102\u0000\u0000\u0478\u0477"+
		"\u0001\u0000\u0000\u0000\u0478\u0479\u0001\u0000\u0000\u0000\u0479\u047a"+
		"\u0001\u0000\u0000\u0000\u047a\u047d\u0003\u00d6k\u0000\u047b\u047c\u0005"+
		"\u0125\u0000\u0000\u047c\u047e\u0003\u0144\u00a2\u0000\u047d\u047b\u0001"+
		"\u0000\u0000\u0000\u047d\u047e\u0001\u0000\u0000\u0000\u047e\u047f\u0001"+
		"\u0000\u0000\u0000\u047f\u0480\u0005\u0002\u0000\u0000\u0480\u0481\u0003"+
		"\u00d8l\u0000\u0481\u0484\u0005\u0003\u0000\u0000\u0482\u0483\u0005\u00b4"+
		"\u0000\u0000\u0483\u0485\u0003>\u001f\u0000\u0484\u0482\u0001\u0000\u0000"+
		"\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u049b\u0001\u0000\u0000"+
		"\u0000\u0486\u0487\u0005R\u0000\u0000\u0487\u048a\u0005|\u0000\u0000\u0488"+
		"\u0489\u0005w\u0000\u0000\u0489\u048b\u0005Z\u0000\u0000\u048a\u0488\u0001"+
		"\u0000\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0001"+
		"\u0000\u0000\u0000\u048c\u048d\u0003\u0144\u00a2\u0000\u048d\u048f\u0005"+
		"\u00b1\u0000\u0000\u048e\u0490\u0005\u0102\u0000\u0000\u048f\u048e\u0001"+
		"\u0000\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0001"+
		"\u0000\u0000\u0000\u0491\u0492\u0003\u00d6k\u0000\u0492\u049b\u0001\u0000"+
		"\u0000\u0000\u0493\u0497\u0003\u0016\u000b\u0000\u0494\u0496\t\u0000\u0000"+
		"\u0000\u0495\u0494\u0001\u0000\u0000\u0000\u0496\u0499\u0001\u0000\u0000"+
		"\u0000\u0497\u0498\u0001\u0000\u0000\u0000\u0497\u0495\u0001\u0000\u0000"+
		"\u0000\u0498\u049b\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000"+
		"\u0000\u049a\u0177\u0001\u0000\u0000\u0000\u049a\u0179\u0001\u0000\u0000"+
		"\u0000\u049a\u017c\u0001\u0000\u0000\u0000\u049a\u017e\u0001\u0000\u0000"+
		"\u0000\u049a\u0182\u0001\u0000\u0000\u0000\u049a\u0188\u0001\u0000\u0000"+
		"\u0000\u049a\u019a\u0001\u0000\u0000\u0000\u049a\u01a1\u0001\u0000\u0000"+
		"\u0000\u049a\u01a7\u0001\u0000\u0000\u0000\u049a\u01b1\u0001\u0000\u0000"+
		"\u0000\u049a\u01bd\u0001\u0000\u0000\u0000\u049a\u01ce\u0001\u0000\u0000"+
		"\u0000\u049a\u01e3\u0001\u0000\u0000\u0000\u049a\u01f4\u0001\u0000\u0000"+
		"\u0000\u049a\u0205\u0001\u0000\u0000\u0000\u049a\u0210\u0001\u0000\u0000"+
		"\u0000\u049a\u0217\u0001\u0000\u0000\u0000\u049a\u0220\u0001\u0000\u0000"+
		"\u0000\u049a\u0229\u0001\u0000\u0000\u0000\u049a\u0236\u0001\u0000\u0000"+
		"\u0000\u049a\u0241\u0001\u0000\u0000\u0000\u049a\u0248\u0001\u0000\u0000"+
		"\u0000\u049a\u024f\u0001\u0000\u0000\u0000\u049a\u025a\u0001\u0000\u0000"+
		"\u0000\u049a\u0265\u0001\u0000\u0000\u0000\u049a\u0274\u0001\u0000\u0000"+
		"\u0000\u049a\u0280\u0001\u0000\u0000\u0000\u049a\u028e\u0001\u0000\u0000"+
		"\u0000\u049a\u0298\u0001\u0000\u0000\u0000\u049a\u02a6\u0001\u0000\u0000"+
		"\u0000\u049a\u02ae\u0001\u0000\u0000\u0000\u049a\u02c1\u0001\u0000\u0000"+
		"\u0000\u049a\u02ca\u0001\u0000\u0000\u0000\u049a\u02d0\u0001\u0000\u0000"+
		"\u0000\u049a\u02da\u0001\u0000\u0000\u0000\u049a\u02e1\u0001\u0000\u0000"+
		"\u0000\u049a\u0304\u0001\u0000\u0000\u0000\u049a\u031a\u0001\u0000\u0000"+
		"\u0000\u049a\u0322\u0001\u0000\u0000\u0000\u049a\u033e\u0001\u0000\u0000"+
		"\u0000\u049a\u0348\u0001\u0000\u0000\u0000\u049a\u034d\u0001\u0000\u0000"+
		"\u0000\u049a\u0359\u0001\u0000\u0000\u0000\u049a\u0365\u0001\u0000\u0000"+
		"\u0000\u049a\u036e\u0001\u0000\u0000\u0000\u049a\u0376\u0001\u0000\u0000"+
		"\u0000\u049a\u0382\u0001\u0000\u0000\u0000\u049a\u0388\u0001\u0000\u0000"+
		"\u0000\u049a\u039a\u0001\u0000\u0000\u0000\u049a\u03a2\u0001\u0000\u0000"+
		"\u0000\u049a\u03a5\u0001\u0000\u0000\u0000\u049a\u03ad\u0001\u0000\u0000"+
		"\u0000\u049a\u03b3\u0001\u0000\u0000\u0000\u049a\u03ba\u0001\u0000\u0000"+
		"\u0000\u049a\u03c8\u0001\u0000\u0000\u0000\u049a\u03cd\u0001\u0000\u0000"+
		"\u0000\u049a\u03d4\u0001\u0000\u0000\u0000\u049a\u03db\u0001\u0000\u0000"+
		"\u0000\u049a\u03de\u0001\u0000\u0000\u0000\u049a\u03e1\u0001\u0000\u0000"+
		"\u0000\u049a\u03eb\u0001\u0000\u0000\u0000\u049a\u03fb\u0001\u0000\u0000"+
		"\u0000\u049a\u0402\u0001\u0000\u0000\u0000\u049a\u0404\u0001\u0000\u0000"+
		"\u0000\u049a\u0414\u0001\u0000\u0000\u0000\u049a\u041b\u0001\u0000\u0000"+
		"\u0000\u049a\u0424\u0001\u0000\u0000\u0000\u049a\u042c\u0001\u0000\u0000"+
		"\u0000\u049a\u0434\u0001\u0000\u0000\u0000\u049a\u0438\u0001\u0000\u0000"+
		"\u0000\u049a\u043c\u0001\u0000\u0000\u0000\u049a\u0445\u0001\u0000\u0000"+
		"\u0000\u049a\u044a\u0001\u0000\u0000\u0000\u049a\u0455\u0001\u0000\u0000"+
		"\u0000\u049a\u045e\u0001\u0000\u0000\u0000\u049a\u0465\u0001\u0000\u0000"+
		"\u0000\u049a\u0467\u0001\u0000\u0000\u0000\u049a\u046e\u0001\u0000\u0000"+
		"\u0000\u049a\u0486\u0001\u0000\u0000\u0000\u049a\u0493\u0001\u0000\u0000"+
		"\u0000\u049b\u000f\u0001\u0000\u0000\u0000\u049c\u049f\u0003\u0150\u00a8"+
		"\u0000\u049d\u049f\u0005\u0094\u0000\u0000\u049e\u049c\u0001\u0000\u0000"+
		"\u0000\u049e\u049d\u0001\u0000\u0000\u0000\u049f\u0011\u0001\u0000\u0000"+
		"\u0000\u04a0\u04a1\u0003\u0148\u00a4\u0000\u04a1\u0013\u0001\u0000\u0000"+
		"\u0000\u04a2\u04a3\u0003\u014a\u00a5\u0000\u04a3\u0015\u0001\u0000\u0000"+
		"\u0000\u04a4\u04a5\u00055\u0000\u0000\u04a5\u054d\u0005\u00df\u0000\u0000"+
		"\u04a6\u04a7\u0005R\u0000\u0000\u04a7\u054d\u0005\u00df\u0000\u0000\u04a8"+
		"\u04aa\u0005q\u0000\u0000\u04a9\u04ab\u0005\u00df\u0000\u0000\u04aa\u04a9"+
		"\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u054d"+
		"\u0001\u0000\u0000\u0000\u04ac\u04ae\u0005\u00dc\u0000\u0000\u04ad\u04af"+
		"\u0005\u00df\u0000\u0000\u04ae\u04ad\u0001\u0000\u0000\u0000\u04ae\u04af"+
		"\u0001\u0000\u0000\u0000\u04af\u054d\u0001\u0000\u0000\u0000\u04b0\u04b1"+
		"\u0005\u00f2\u0000\u0000\u04b1\u054d\u0005q\u0000\u0000\u04b2\u04b3\u0005"+
		"\u00f2\u0000\u0000\u04b3\u04b5\u0005\u00df\u0000\u0000\u04b4\u04b6\u0005"+
		"q\u0000\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000"+
		"\u0000\u0000\u04b6\u054d\u0001\u0000\u0000\u0000\u04b7\u04b8\u0005\u00f2"+
		"\u0000\u0000\u04b8\u054d\u0005\u00c9\u0000\u0000\u04b9\u04ba\u0005\u00f2"+
		"\u0000\u0000\u04ba\u054d\u0005\u00e0\u0000\u0000\u04bb\u04bc\u0005\u00f2"+
		"\u0000\u0000\u04bc\u04bd\u00058\u0000\u0000\u04bd\u054d\u0005\u00e0\u0000"+
		"\u0000\u04be\u04bf\u0005\\\u0000\u0000\u04bf\u054d\u0005\u0102\u0000\u0000"+
		"\u04c0\u04c1\u0005y\u0000\u0000\u04c1\u054d\u0005\u0102\u0000\u0000\u04c2"+
		"\u04c3\u0005\u00f2\u0000\u0000\u04c3\u054d\u00050\u0000\u0000\u04c4\u04c5"+
		"\u0005\u00f2\u0000\u0000\u04c5\u04c6\u00055\u0000\u0000\u04c6\u054d\u0005"+
		"\u0102\u0000\u0000\u04c7\u04c8\u0005\u00f2\u0000\u0000\u04c8\u054d\u0005"+
		"\u0112\u0000\u0000\u04c9\u04ca\u0005\u00f2\u0000\u0000\u04ca\u054d\u0005"+
		"}\u0000\u0000\u04cb\u04cc\u0005\u00f2\u0000\u0000\u04cc\u054d\u0005\u0097"+
		"\u0000\u0000\u04cd\u04ce\u00055\u0000\u0000\u04ce\u054d\u0005|\u0000\u0000"+
		"\u04cf\u04d0\u0005R\u0000\u0000\u04d0\u054d\u0005|\u0000\u0000\u04d1\u04d2"+
		"\u0005\u000b\u0000\u0000\u04d2\u054d\u0005|\u0000\u0000\u04d3\u04d4\u0005"+
		"\u0096\u0000\u0000\u04d4\u054d\u0005\u0102\u0000\u0000\u04d5\u04d6\u0005"+
		"\u0096\u0000\u0000\u04d6\u054d\u0005A\u0000\u0000\u04d7\u04d8\u0005\u011f"+
		"\u0000\u0000\u04d8\u054d\u0005\u0102\u0000\u0000\u04d9\u04da\u0005\u011f"+
		"\u0000\u0000\u04da\u054d\u0005A\u0000\u0000\u04db\u04dc\u00055\u0000\u0000"+
		"\u04dc\u04dd\u0005\u0107\u0000\u0000\u04dd\u054d\u0005\u0099\u0000\u0000"+
		"\u04de\u04df\u0005R\u0000\u0000\u04df\u04e0\u0005\u0107\u0000\u0000\u04e0"+
		"\u054d\u0005\u0099\u0000\u0000\u04e1\u04e2\u0005\u000b\u0000\u0000\u04e2"+
		"\u04e3\u0005\u0102\u0000\u0000\u04e3\u04e4\u0003\u00dcn\u0000\u04e4\u04e5"+
		"\u0005\u00ac\u0000\u0000\u04e5\u04e6\u0005\'\u0000\u0000\u04e6\u054d\u0001"+
		"\u0000\u0000\u0000\u04e7\u04e8\u0005\u000b\u0000\u0000\u04e8\u04e9\u0005"+
		"\u0102\u0000\u0000\u04e9\u04ea\u0003\u00dcn\u0000\u04ea\u04eb\u0005\'"+
		"\u0000\u0000\u04eb\u04ec\u0005\u001c\u0000\u0000\u04ec\u054d\u0001\u0000"+
		"\u0000\u0000\u04ed\u04ee\u0005\u000b\u0000\u0000\u04ee\u04ef\u0005\u0102"+
		"\u0000\u0000\u04ef\u04f0\u0003\u00dcn\u0000\u04f0\u04f1\u0005\u00ac\u0000"+
		"\u0000\u04f1\u04f2\u0005\u00f6\u0000\u0000\u04f2\u054d\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f4\u0005\u000b\u0000\u0000\u04f4\u04f5\u0005\u0102\u0000"+
		"\u0000\u04f5\u04f6\u0003\u00dcn\u0000\u04f6\u04f7\u0005\u00f3\u0000\u0000"+
		"\u04f7\u04f8\u0005\u001c\u0000\u0000\u04f8\u054d\u0001\u0000\u0000\u0000"+
		"\u04f9\u04fa\u0005\u000b\u0000\u0000\u04fa\u04fb\u0005\u0102\u0000\u0000"+
		"\u04fb\u04fc\u0003\u00dcn\u0000\u04fc\u04fd\u0005\u00ac\u0000\u0000\u04fd"+
		"\u04fe\u0005\u00f3\u0000\u0000\u04fe\u054d\u0001\u0000\u0000\u0000\u04ff"+
		"\u0500\u0005\u000b\u0000\u0000\u0500\u0501\u0005\u0102\u0000\u0000\u0501"+
		"\u0502\u0003\u00dcn\u0000\u0502\u0503\u0005\u00ac\u0000\u0000\u0503\u0504"+
		"\u0005\u00fa\u0000\u0000\u0504\u0505\u0005\u0014\u0000\u0000\u0505\u0506"+
		"\u0005M\u0000\u0000\u0506\u054d\u0001\u0000\u0000\u0000\u0507\u0508\u0005"+
		"\u000b\u0000\u0000\u0508\u0509\u0005\u0102\u0000\u0000\u0509\u050a\u0003"+
		"\u00dcn\u0000\u050a\u050b\u0005\u00ef\u0000\u0000\u050b\u050c\u0005\u00f3"+
		"\u0000\u0000\u050c\u050d\u0005\u0095\u0000\u0000\u050d\u054d\u0001\u0000"+
		"\u0000\u0000\u050e\u050f\u0005\u000b\u0000\u0000\u050f\u0510\u0005\u0102"+
		"\u0000\u0000\u0510\u0511\u0003\u00dcn\u0000\u0511\u0512\u0005X\u0000\u0000"+
		"\u0512\u0513\u0005\u00be\u0000\u0000\u0513\u054d\u0001\u0000\u0000\u0000"+
		"\u0514\u0515\u0005\u000b\u0000\u0000\u0515\u0516\u0005\u0102\u0000\u0000"+
		"\u0516\u0517\u0003\u00dcn\u0000\u0517\u0518\u0005\u0012\u0000\u0000\u0518"+
		"\u0519\u0005\u00be\u0000\u0000\u0519\u054d\u0001\u0000\u0000\u0000\u051a"+
		"\u051b\u0005\u000b\u0000\u0000\u051b\u051c\u0005\u0102\u0000\u0000\u051c"+
		"\u051d\u0003\u00dcn\u0000\u051d\u051e\u0005\u0119\u0000\u0000\u051e\u051f"+
		"\u0005\u00be\u0000\u0000\u051f\u054d\u0001\u0000\u0000\u0000\u0520\u0521"+
		"\u0005\u000b\u0000\u0000\u0521\u0522\u0005\u0102\u0000\u0000\u0522\u0523"+
		"\u0003\u00dcn\u0000\u0523\u0524\u0005\u010f\u0000\u0000\u0524\u054d\u0001"+
		"\u0000\u0000\u0000\u0525\u0526\u0005\u000b\u0000\u0000\u0526\u0527\u0005"+
		"\u0102\u0000\u0000\u0527\u0529\u0003\u00dcn\u0000\u0528\u052a\u0003*\u0015"+
		"\u0000\u0529\u0528\u0001\u0000\u0000\u0000\u0529\u052a\u0001\u0000\u0000"+
		"\u0000\u052a\u052b\u0001\u0000\u0000\u0000\u052b\u052c\u0005/\u0000\u0000"+
		"\u052c\u054d\u0001\u0000\u0000\u0000\u052d\u052e\u0005\u000b\u0000\u0000"+
		"\u052e\u052f\u0005\u0102\u0000\u0000\u052f\u0531\u0003\u00dcn\u0000\u0530"+
		"\u0532\u0003*\u0015\u0000\u0531\u0530\u0001\u0000\u0000\u0000\u0531\u0532"+
		"\u0001\u0000\u0000\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0534"+
		"\u00052\u0000\u0000\u0534\u054d\u0001\u0000\u0000\u0000\u0535\u0536\u0005"+
		"\u000b\u0000\u0000\u0536\u0537\u0005\u0102\u0000\u0000\u0537\u0539\u0003"+
		"\u00dcn\u0000\u0538\u053a\u0003*\u0015\u0000\u0539\u0538\u0001\u0000\u0000"+
		"\u0000\u0539\u053a\u0001\u0000\u0000\u0000\u053a\u053b\u0001\u0000\u0000"+
		"\u0000\u053b\u053c\u0005\u00ef\u0000\u0000\u053c\u053d\u0005d\u0000\u0000"+
		"\u053d\u054d\u0001\u0000\u0000\u0000\u053e\u053f\u0005\u000b\u0000\u0000"+
		"\u053f\u0540\u0005\u0102\u0000\u0000\u0540\u0542\u0003\u00dcn\u0000\u0541"+
		"\u0543\u0003*\u0015\u0000\u0542\u0541\u0001\u0000\u0000\u0000\u0542\u0543"+
		"\u0001\u0000\u0000\u0000\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0545"+
		"\u0005\u00d8\u0000\u0000\u0545\u0546\u0005,\u0000\u0000\u0546\u054d\u0001"+
		"\u0000\u0000\u0000\u0547\u0548\u0005\u00f8\u0000\u0000\u0548\u054d\u0005"+
		"\u0111\u0000\u0000\u0549\u054d\u0005.\u0000\u0000\u054a\u054d\u0005\u00e1"+
		"\u0000\u0000\u054b\u054d\u0005L\u0000\u0000\u054c\u04a4\u0001\u0000\u0000"+
		"\u0000\u054c\u04a6\u0001\u0000\u0000\u0000\u054c\u04a8\u0001\u0000\u0000"+
		"\u0000\u054c\u04ac\u0001\u0000\u0000\u0000\u054c\u04b0\u0001\u0000\u0000"+
		"\u0000\u054c\u04b2\u0001\u0000\u0000\u0000\u054c\u04b7\u0001\u0000\u0000"+
		"\u0000\u054c\u04b9\u0001\u0000\u0000\u0000\u054c\u04bb\u0001\u0000\u0000"+
		"\u0000\u054c\u04be\u0001\u0000\u0000\u0000\u054c\u04c0\u0001\u0000\u0000"+
		"\u0000\u054c\u04c2\u0001\u0000\u0000\u0000\u054c\u04c4\u0001\u0000\u0000"+
		"\u0000\u054c\u04c7\u0001\u0000\u0000\u0000\u054c\u04c9\u0001\u0000\u0000"+
		"\u0000\u054c\u04cb\u0001\u0000\u0000\u0000\u054c\u04cd\u0001\u0000\u0000"+
		"\u0000\u054c\u04cf\u0001\u0000\u0000\u0000\u054c\u04d1\u0001\u0000\u0000"+
		"\u0000\u054c\u04d3\u0001\u0000\u0000\u0000\u054c\u04d5\u0001\u0000\u0000"+
		"\u0000\u054c\u04d7\u0001\u0000\u0000\u0000\u054c\u04d9\u0001\u0000\u0000"+
		"\u0000\u054c\u04db\u0001\u0000\u0000\u0000\u054c\u04de\u0001\u0000\u0000"+
		"\u0000\u054c\u04e1\u0001\u0000\u0000\u0000\u054c\u04e7\u0001\u0000\u0000"+
		"\u0000\u054c\u04ed\u0001\u0000\u0000\u0000\u054c\u04f3\u0001\u0000\u0000"+
		"\u0000\u054c\u04f9\u0001\u0000\u0000\u0000\u054c\u04ff\u0001\u0000\u0000"+
		"\u0000\u054c\u0507\u0001\u0000\u0000\u0000\u054c\u050e\u0001\u0000\u0000"+
		"\u0000\u054c\u0514\u0001\u0000\u0000\u0000\u054c\u051a\u0001\u0000\u0000"+
		"\u0000\u054c\u0520\u0001\u0000\u0000\u0000\u054c\u0525\u0001\u0000\u0000"+
		"\u0000\u054c\u052d\u0001\u0000\u0000\u0000\u054c\u0535\u0001\u0000\u0000"+
		"\u0000\u054c\u053e\u0001\u0000\u0000\u0000\u054c\u0547\u0001\u0000\u0000"+
		"\u0000\u054c\u0549\u0001\u0000\u0000\u0000\u054c\u054a\u0001\u0000\u0000"+
		"\u0000\u054c\u054b\u0001\u0000\u0000\u0000\u054d\u0017\u0001\u0000\u0000"+
		"\u0000\u054e\u0550\u00055\u0000\u0000\u054f\u0551\u0005\u0107\u0000\u0000"+
		"\u0550\u054f\u0001\u0000\u0000\u0000\u0550\u0551\u0001\u0000\u0000\u0000"+
		"\u0551\u0553\u0001\u0000\u0000\u0000\u0552\u0554\u0005^\u0000\u0000\u0553"+
		"\u0552\u0001\u0000\u0000\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554"+
		"\u0555\u0001\u0000\u0000\u0000\u0555\u0559\u0005\u0102\u0000\u0000\u0556"+
		"\u0557\u0005w\u0000\u0000\u0557\u0558\u0005\u00ac\u0000\u0000\u0558\u055a"+
		"\u0005Z\u0000\u0000\u0559\u0556\u0001\u0000\u0000\u0000\u0559\u055a\u0001"+
		"\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000\u055b\u055c\u0003"+
		"\u00d6k\u0000\u055c\u0019\u0001\u0000\u0000\u0000\u055d\u055e\u00055\u0000"+
		"\u0000\u055e\u0560\u0005\u00b5\u0000\u0000\u055f\u055d\u0001\u0000\u0000"+
		"\u0000\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000"+
		"\u0000\u0561\u0562\u0005\u00d8\u0000\u0000\u0562\u0563\u0005\u0102\u0000"+
		"\u0000\u0563\u0564\u0003\u00d6k\u0000\u0564\u001b\u0001\u0000\u0000\u0000"+
		"\u0565\u0566\u0005\'\u0000\u0000\u0566\u0567\u0005\u001c\u0000\u0000\u0567"+
		"\u056b\u0003\u00be_\u0000\u0568\u0569\u0005\u00f6\u0000\u0000\u0569\u056a"+
		"\u0005\u001c\u0000\u0000\u056a\u056c\u0003\u00c2a\u0000\u056b\u0568\u0001"+
		"\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u056d\u0001"+
		"\u0000\u0000\u0000\u056d\u056e\u0005\u0084\u0000\u0000\u056e\u056f\u0005"+
		"\u014f\u0000\u0000\u056f\u0570\u0005\u001b\u0000\u0000\u0570\u001d\u0001"+
		"\u0000\u0000\u0000\u0571\u0572\u0005\u00f3\u0000\u0000\u0572\u0573\u0005"+
		"\u001c\u0000\u0000\u0573\u0574\u0003\u00be_\u0000\u0574\u0577\u0005\u00b1"+
		"\u0000\u0000\u0575\u0578\u0003F#\u0000\u0576\u0578\u0003H$\u0000\u0577"+
		"\u0575\u0001\u0000\u0000\u0000\u0577\u0576\u0001\u0000\u0000\u0000\u0578"+
		"\u057c\u0001\u0000\u0000\u0000\u0579\u057a\u0005\u00fa\u0000\u0000\u057a"+
		"\u057b\u0005\u0014\u0000\u0000\u057b\u057d\u0005M\u0000\u0000\u057c\u0579"+
		"\u0001\u0000\u0000\u0000\u057c\u057d\u0001\u0000\u0000\u0000\u057d\u001f"+
		"\u0001\u0000\u0000\u0000\u057e\u057f\u0005\u0095\u0000\u0000\u057f\u0580"+
		"\u0003\u0150\u00a8\u0000\u0580!\u0001\u0000\u0000\u0000\u0581\u0582\u0005"+
		"-\u0000\u0000\u0582\u0583\u0003\u0150\u00a8\u0000\u0583#\u0001\u0000\u0000"+
		"\u0000\u0584\u0586\u00036\u001b\u0000\u0585\u0584\u0001\u0000\u0000\u0000"+
		"\u0585\u0586\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000\u0000"+
		"\u0587\u0588\u0003X,\u0000\u0588\u0589\u0003T*\u0000\u0589%\u0001\u0000"+
		"\u0000\u0000\u058a\u058b\u0005\u0081\u0000\u0000\u058b\u058d\u0005\u00bd"+
		"\u0000\u0000\u058c\u058e\u0005\u0102\u0000\u0000\u058d\u058c\u0001\u0000"+
		"\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e\u058f\u0001\u0000"+
		"\u0000\u0000\u058f\u0596\u0003\u00d6k\u0000\u0590\u0594\u0003*\u0015\u0000"+
		"\u0591\u0592\u0005w\u0000\u0000\u0592\u0593\u0005\u00ac\u0000\u0000\u0593"+
		"\u0595\u0005Z\u0000\u0000\u0594\u0591\u0001\u0000\u0000\u0000\u0594\u0595"+
		"\u0001\u0000\u0000\u0000\u0595\u0597\u0001\u0000\u0000\u0000\u0596\u0590"+
		"\u0001\u0000\u0000\u0000\u0596\u0597\u0001\u0000\u0000\u0000\u0597\u0599"+
		"\u0001\u0000\u0000\u0000\u0598\u059a\u0003\u00be_\u0000\u0599\u0598\u0001"+
		"\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a\u05d1\u0001"+
		"\u0000\u0000\u0000\u059b\u059c\u0005\u0081\u0000\u0000\u059c\u059e\u0005"+
		"\u0084\u0000\u0000\u059d\u059f\u0005\u0102\u0000\u0000\u059e\u059d\u0001"+
		"\u0000\u0000\u0000\u059e\u059f\u0001\u0000\u0000\u0000\u059f\u05a0\u0001"+
		"\u0000\u0000\u0000\u05a0\u05a2\u0003\u00d6k\u0000\u05a1\u05a3\u0003*\u0015"+
		"\u0000\u05a2\u05a1\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000"+
		"\u0000\u05a3\u05a7\u0001\u0000\u0000\u0000\u05a4\u05a5\u0005w\u0000\u0000"+
		"\u05a5\u05a6\u0005\u00ac\u0000\u0000\u05a6\u05a8\u0005Z\u0000\u0000\u05a7"+
		"\u05a4\u0001\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8"+
		"\u05aa\u0001\u0000\u0000\u0000\u05a9\u05ab\u0003\u00be_\u0000\u05aa\u05a9"+
		"\u0001\u0000\u0000\u0000\u05aa\u05ab\u0001\u0000\u0000\u0000\u05ab\u05d1"+
		"\u0001\u0000\u0000\u0000\u05ac\u05ad\u0005\u0081\u0000\u0000\u05ad\u05af"+
		"\u0005\u0084\u0000\u0000\u05ae\u05b0\u0005\u0102\u0000\u0000\u05af\u05ae"+
		"\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000\u0000\u0000\u05b0\u05b1"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b2\u0003\u00d6k\u0000\u05b2\u05b3\u0005"+
		"\u00d8\u0000\u0000\u05b3\u05b4\u0003z=\u0000\u05b4\u05d1\u0001\u0000\u0000"+
		"\u0000\u05b5\u05b6\u0005\u0081\u0000\u0000\u05b6\u05b8\u0005\u00bd\u0000"+
		"\u0000\u05b7\u05b9\u0005\u0094\u0000\u0000\u05b8\u05b7\u0001\u0000\u0000"+
		"\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000\u0000"+
		"\u0000\u05ba\u05bb\u0005N\u0000\u0000\u05bb\u05bd\u0003\u0150\u00a8\u0000"+
		"\u05bc\u05be\u0003\u00d2i\u0000\u05bd\u05bc\u0001\u0000\u0000\u0000\u05bd"+
		"\u05be\u0001\u0000\u0000\u0000\u05be\u05c0\u0001\u0000\u0000\u0000\u05bf"+
		"\u05c1\u0003J%\u0000\u05c0\u05bf\u0001\u0000\u0000\u0000\u05c0\u05c1\u0001"+
		"\u0000\u0000\u0000\u05c1\u05d1\u0001\u0000\u0000\u0000\u05c2\u05c3\u0005"+
		"\u0081\u0000\u0000\u05c3\u05c5\u0005\u00bd\u0000\u0000\u05c4\u05c6\u0005"+
		"\u0094\u0000\u0000\u05c5\u05c4\u0001\u0000\u0000\u0000\u05c5\u05c6\u0001"+
		"\u0000\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c9\u0005"+
		"N\u0000\u0000\u05c8\u05ca\u0003\u0150\u00a8\u0000\u05c9\u05c8\u0001\u0000"+
		"\u0000\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000"+
		"\u0000\u0000\u05cb\u05ce\u0003:\u001d\u0000\u05cc\u05cd\u0005\u00b4\u0000"+
		"\u0000\u05cd\u05cf\u0003>\u001f\u0000\u05ce\u05cc\u0001\u0000\u0000\u0000"+
		"\u05ce\u05cf\u0001\u0000\u0000\u0000\u05cf\u05d1\u0001\u0000\u0000\u0000"+
		"\u05d0\u058a\u0001\u0000\u0000\u0000\u05d0\u059b\u0001\u0000\u0000\u0000"+
		"\u05d0\u05ac\u0001\u0000\u0000\u0000\u05d0\u05b5\u0001\u0000\u0000\u0000"+
		"\u05d0\u05c2\u0001\u0000\u0000\u0000\u05d1\'\u0001\u0000\u0000\u0000\u05d2"+
		"\u05d4\u0003*\u0015\u0000\u05d3\u05d5\u0003 \u0010\u0000\u05d4\u05d3\u0001"+
		"\u0000\u0000\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5)\u0001\u0000"+
		"\u0000\u0000\u05d6\u05d7\u0005\u00be\u0000\u0000\u05d7\u05d8\u0005\u0002"+
		"\u0000\u0000\u05d8\u05dd\u0003,\u0016\u0000\u05d9\u05da\u0005\u0004\u0000"+
		"\u0000\u05da\u05dc\u0003,\u0016\u0000\u05db\u05d9\u0001\u0000\u0000\u0000"+
		"\u05dc\u05df\u0001\u0000\u0000\u0000\u05dd\u05db\u0001\u0000\u0000\u0000"+
		"\u05dd\u05de\u0001\u0000\u0000\u0000\u05de\u05e0\u0001\u0000\u0000\u0000"+
		"\u05df\u05dd\u0001\u0000\u0000\u0000\u05e0\u05e1\u0005\u0003\u0000\u0000"+
		"\u05e1+\u0001\u0000\u0000\u0000\u05e2\u05e5\u0003\u0144\u00a2\u0000\u05e3"+
		"\u05e4\u0005\u0134\u0000\u0000\u05e4\u05e6\u0003\u00fa}\u0000\u05e5\u05e3"+
		"\u0001\u0000\u0000\u0000\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u05ec"+
		"\u0001\u0000\u0000\u0000\u05e7\u05e8\u0003\u0144\u00a2\u0000\u05e8\u05e9"+
		"\u0005\u0134\u0000\u0000\u05e9\u05ea\u0005F\u0000\u0000\u05ea\u05ec\u0001"+
		"\u0000\u0000\u0000\u05eb\u05e2\u0001\u0000\u0000\u0000\u05eb\u05e7\u0001"+
		"\u0000\u0000\u0000\u05ec-\u0001\u0000\u0000\u0000\u05ed\u05ee\u0007\u000b"+
		"\u0000\u0000\u05ee/\u0001\u0000\u0000\u0000\u05ef\u05f0\u0007\f\u0000"+
		"\u0000\u05f01\u0001\u0000\u0000\u0000\u05f1\u05f7\u0003\u013e\u009f\u0000"+
		"\u05f2\u05f7\u0003\u0150\u00a8\u0000\u05f3\u05f7\u0003\u00fc~\u0000\u05f4"+
		"\u05f7\u0003\u00fe\u007f\u0000\u05f5\u05f7\u0003\u0100\u0080\u0000\u05f6"+
		"\u05f1\u0001\u0000\u0000\u0000\u05f6\u05f2\u0001\u0000\u0000\u0000\u05f6"+
		"\u05f3\u0001\u0000\u0000\u0000\u05f6\u05f4\u0001\u0000\u0000\u0000\u05f6"+
		"\u05f5\u0001\u0000\u0000\u0000\u05f73\u0001\u0000\u0000\u0000\u05f8\u05fd"+
		"\u0003\u0144\u00a2\u0000\u05f9\u05fa\u0005\u0005\u0000\u0000\u05fa\u05fc"+
		"\u0003\u0144\u00a2\u0000\u05fb\u05f9\u0001\u0000\u0000\u0000\u05fc\u05ff"+
		"\u0001\u0000\u0000\u0000\u05fd\u05fb\u0001\u0000\u0000\u0000\u05fd\u05fe"+
		"\u0001\u0000\u0000\u0000\u05fe5\u0001\u0000\u0000\u0000\u05ff\u05fd\u0001"+
		"\u0000\u0000\u0000\u0600\u0601\u0005\u012f\u0000\u0000\u0601\u0606\u0003"+
		"8\u001c\u0000\u0602\u0603\u0005\u0004\u0000\u0000\u0603\u0605\u00038\u001c"+
		"\u0000\u0604\u0602\u0001\u0000\u0000\u0000\u0605\u0608\u0001\u0000\u0000"+
		"\u0000\u0606\u0604\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000"+
		"\u0000\u06077\u0001\u0000\u0000\u0000\u0608\u0606\u0001\u0000\u0000\u0000"+
		"\u0609\u060b\u0003\u0140\u00a0\u0000\u060a\u060c\u0003\u00be_\u0000\u060b"+
		"\u060a\u0001\u0000\u0000\u0000\u060b\u060c\u0001\u0000\u0000\u0000\u060c"+
		"\u060e\u0001\u0000\u0000\u0000\u060d\u060f\u0005\u0014\u0000\u0000\u060e"+
		"\u060d\u0001\u0000\u0000\u0000\u060e\u060f\u0001\u0000\u0000\u0000\u060f"+
		"\u0610\u0001\u0000\u0000\u0000\u0610\u0611\u0005\u0002\u0000\u0000\u0611"+
		"\u0612\u0003$\u0012\u0000\u0612\u0613\u0005\u0003\u0000\u0000\u06139\u0001"+
		"\u0000\u0000\u0000\u0614\u0615\u0005\u0125\u0000\u0000\u0615\u0616\u0003"+
		"\u00d6k\u0000\u0616;\u0001\u0000\u0000\u0000\u0617\u0618\u0005\u00b4\u0000"+
		"\u0000\u0618\u0625\u0003>\u001f\u0000\u0619\u061a\u0005\u00bf\u0000\u0000"+
		"\u061a\u061b\u0005\u001c\u0000\u0000\u061b\u0625\u0003\u00e4r\u0000\u061c"+
		"\u0625\u0003\u001e\u000f\u0000\u061d\u0625\u0003\u001c\u000e\u0000\u061e"+
		"\u0625\u0003\u00d2i\u0000\u061f\u0625\u0003J%\u0000\u0620\u0625\u0003"+
		" \u0010\u0000\u0621\u0625\u0003\"\u0011\u0000\u0622\u0623\u0005\u0106"+
		"\u0000\u0000\u0623\u0625\u0003>\u001f\u0000\u0624\u0617\u0001\u0000\u0000"+
		"\u0000\u0624\u0619\u0001\u0000\u0000\u0000\u0624\u061c\u0001\u0000\u0000"+
		"\u0000\u0624\u061d\u0001\u0000\u0000\u0000\u0624\u061e\u0001\u0000\u0000"+
		"\u0000\u0624\u061f\u0001\u0000\u0000\u0000\u0624\u0620\u0001\u0000\u0000"+
		"\u0000\u0624\u0621\u0001\u0000\u0000\u0000\u0624\u0622\u0001\u0000\u0000"+
		"\u0000\u0625\u0628\u0001\u0000\u0000\u0000\u0626\u0624\u0001\u0000\u0000"+
		"\u0000\u0626\u0627\u0001\u0000\u0000\u0000\u0627=\u0001\u0000\u0000\u0000"+
		"\u0628\u0626\u0001\u0000\u0000\u0000\u0629\u062a\u0005\u0002\u0000\u0000"+
		"\u062a\u062f\u0003@ \u0000\u062b\u062c\u0005\u0004\u0000\u0000\u062c\u062e"+
		"\u0003@ \u0000\u062d\u062b\u0001\u0000\u0000\u0000\u062e\u0631\u0001\u0000"+
		"\u0000\u0000\u062f\u062d\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000"+
		"\u0000\u0000\u0630\u0632\u0001\u0000\u0000\u0000\u0631\u062f\u0001\u0000"+
		"\u0000\u0000\u0632\u0633\u0005\u0003\u0000\u0000\u0633?\u0001\u0000\u0000"+
		"\u0000\u0634\u0639\u0003B!\u0000\u0635\u0637\u0005\u0134\u0000\u0000\u0636"+
		"\u0635\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000\u0000\u0000\u0637"+
		"\u0638\u0001\u0000\u0000\u0000\u0638\u063a\u0003D\"\u0000\u0639\u0636"+
		"\u0001\u0000\u0000\u0000\u0639\u063a\u0001\u0000\u0000\u0000\u063aA\u0001"+
		"\u0000\u0000\u0000\u063b\u0640\u0003\u0144\u00a2\u0000\u063c\u063d\u0005"+
		"\u0005\u0000\u0000\u063d\u063f\u0003\u0144\u00a2\u0000\u063e\u063c\u0001"+
		"\u0000\u0000\u0000\u063f\u0642\u0001\u0000\u0000\u0000\u0640\u063e\u0001"+
		"\u0000\u0000\u0000\u0640\u0641\u0001\u0000\u0000\u0000\u0641\u0645\u0001"+
		"\u0000\u0000\u0000\u0642\u0640\u0001\u0000\u0000\u0000\u0643\u0645\u0003"+
		"\u0150\u00a8\u0000\u0644\u063b\u0001\u0000\u0000\u0000\u0644\u0643\u0001"+
		"\u0000\u0000\u0000\u0645C\u0001\u0000\u0000\u0000\u0646\u064b\u0005\u014f"+
		"\u0000\u0000\u0647\u064b\u0005\u0151\u0000\u0000\u0648\u064b\u0003\u0102"+
		"\u0081\u0000\u0649\u064b\u0003\u0150\u00a8\u0000\u064a\u0646\u0001\u0000"+
		"\u0000\u0000\u064a\u0647\u0001\u0000\u0000\u0000\u064a\u0648\u0001\u0000"+
		"\u0000\u0000\u064a\u0649\u0001\u0000\u0000\u0000\u064bE\u0001\u0000\u0000"+
		"\u0000\u064c\u064d\u0005\u0002\u0000\u0000\u064d\u0652\u0003\u00fa}\u0000"+
		"\u064e\u064f\u0005\u0004\u0000\u0000\u064f\u0651\u0003\u00fa}\u0000\u0650"+
		"\u064e\u0001\u0000\u0000\u0000\u0651\u0654\u0001\u0000\u0000\u0000\u0652"+
		"\u0650\u0001\u0000\u0000\u0000\u0652\u0653\u0001\u0000\u0000\u0000\u0653"+
		"\u0655\u0001\u0000\u0000\u0000\u0654\u0652\u0001\u0000\u0000\u0000\u0655"+
		"\u0656\u0005\u0003\u0000\u0000\u0656G\u0001\u0000\u0000\u0000\u0657\u0658"+
		"\u0005\u0002\u0000\u0000\u0658\u065d\u0003F#\u0000\u0659\u065a\u0005\u0004"+
		"\u0000\u0000\u065a\u065c\u0003F#\u0000\u065b\u0659\u0001\u0000\u0000\u0000"+
		"\u065c\u065f\u0001\u0000\u0000\u0000\u065d\u065b\u0001\u0000\u0000\u0000"+
		"\u065d\u065e\u0001\u0000\u0000\u0000\u065e\u0660\u0001\u0000\u0000\u0000"+
		"\u065f\u065d\u0001\u0000\u0000\u0000\u0660\u0661\u0005\u0003\u0000\u0000"+
		"\u0661I\u0001\u0000\u0000\u0000\u0662\u0663\u0005\u00fa\u0000\u0000\u0663"+
		"\u0664\u0005\u0014\u0000\u0000\u0664\u0669\u0003L&\u0000\u0665\u0666\u0005"+
		"\u00fa\u0000\u0000\u0666\u0667\u0005\u001c\u0000\u0000\u0667\u0669\u0003"+
		"N\'\u0000\u0668\u0662\u0001\u0000\u0000\u0000\u0668\u0665\u0001\u0000"+
		"\u0000\u0000\u0669K\u0001\u0000\u0000\u0000\u066a\u066b\u0005\u0080\u0000"+
		"\u0000\u066b\u066c\u0003\u0150\u00a8\u0000\u066c\u066d\u0005\u00b9\u0000"+
		"\u0000\u066d\u066e\u0003\u0150\u00a8\u0000\u066e\u0671\u0001\u0000\u0000"+
		"\u0000\u066f\u0671\u0003\u0144\u00a2\u0000\u0670\u066a\u0001\u0000\u0000"+
		"\u0000\u0670\u066f\u0001\u0000\u0000\u0000\u0671M\u0001\u0000\u0000\u0000"+
		"\u0672\u0676\u0003\u0150\u00a8\u0000\u0673\u0674\u0005\u012f\u0000\u0000"+
		"\u0674\u0675\u0005\u00ed\u0000\u0000\u0675\u0677\u0003>\u001f\u0000\u0676"+
		"\u0673\u0001\u0000\u0000\u0000\u0676\u0677\u0001\u0000\u0000\u0000\u0677"+
		"O\u0001\u0000\u0000\u0000\u0678\u0679\u0003\u0144\u00a2\u0000\u0679\u067a"+
		"\u0003\u0150\u00a8\u0000\u067aQ\u0001\u0000\u0000\u0000\u067b\u067c\u0003"+
		"&\u0013\u0000\u067c\u067d\u0003$\u0012\u0000\u067d\u06b4\u0001\u0000\u0000"+
		"\u0000\u067e\u0680\u0003\u0082A\u0000\u067f\u0681\u0003V+\u0000\u0680"+
		"\u067f\u0001\u0000\u0000\u0000\u0681\u0682\u0001\u0000\u0000\u0000\u0682"+
		"\u0680\u0001\u0000\u0000\u0000\u0682\u0683\u0001\u0000\u0000\u0000\u0683"+
		"\u06b4\u0001\u0000\u0000\u0000\u0684\u0685\u0005H\u0000\u0000\u0685\u0686"+
		"\u0005k\u0000\u0000\u0686\u0687\u0003\u00d6k\u0000\u0687\u0689\u0003\u00d0"+
		"h\u0000\u0688\u068a\u0003z=\u0000\u0689\u0688\u0001\u0000\u0000\u0000"+
		"\u0689\u068a\u0001\u0000\u0000\u0000\u068a\u06b4\u0001\u0000\u0000\u0000"+
		"\u068b\u068c\u0005\u0122\u0000\u0000\u068c\u068d\u0003\u00d6k\u0000\u068d"+
		"\u068e\u0003\u00d0h\u0000\u068e\u0690\u0003h4\u0000\u068f\u0691\u0003"+
		"z=\u0000\u0690\u068f\u0001\u0000\u0000\u0000\u0690\u0691\u0001\u0000\u0000"+
		"\u0000\u0691\u06b4\u0001\u0000\u0000\u0000\u0692\u0693\u0005\u009c\u0000"+
		"\u0000\u0693\u0694\u0005\u0084\u0000\u0000\u0694\u0695\u0003\u00d6k\u0000"+
		"\u0695\u0696\u0003\u00d0h\u0000\u0696\u069c\u0005\u0125\u0000\u0000\u0697"+
		"\u069d\u0003\u00d6k\u0000\u0698\u0699\u0005\u0002\u0000\u0000\u0699\u069a"+
		"\u0003$\u0012\u0000\u069a\u069b\u0005\u0003\u0000\u0000\u069b\u069d\u0001"+
		"\u0000\u0000\u0000\u069c\u0697\u0001\u0000\u0000\u0000\u069c\u0698\u0001"+
		"\u0000\u0000\u0000\u069d\u069e\u0001\u0000\u0000\u0000\u069e\u069f\u0003"+
		"\u00d0h\u0000\u069f\u06a0\u0005\u00b1\u0000\u0000\u06a0\u06a4\u0003\u00f0"+
		"x\u0000\u06a1\u06a3\u0003j5\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000"+
		"\u06a3\u06a6\u0001\u0000\u0000\u0000\u06a4\u06a2\u0001\u0000\u0000\u0000"+
		"\u06a4\u06a5\u0001\u0000\u0000\u0000\u06a5\u06aa\u0001\u0000\u0000\u0000"+
		"\u06a6\u06a4\u0001\u0000\u0000\u0000\u06a7\u06a9\u0003l6\u0000\u06a8\u06a7"+
		"\u0001\u0000\u0000\u0000\u06a9\u06ac\u0001\u0000\u0000\u0000\u06aa\u06a8"+
		"\u0001\u0000\u0000\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06b0"+
		"\u0001\u0000\u0000\u0000\u06ac\u06aa\u0001\u0000\u0000\u0000\u06ad\u06af"+
		"\u0003n7\u0000\u06ae\u06ad\u0001\u0000\u0000\u0000\u06af\u06b2\u0001\u0000"+
		"\u0000\u0000\u06b0\u06ae\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000"+
		"\u0000\u0000\u06b1\u06b4\u0001\u0000\u0000\u0000\u06b2\u06b0\u0001\u0000"+
		"\u0000\u0000\u06b3\u067b\u0001\u0000\u0000\u0000\u06b3\u067e\u0001\u0000"+
		"\u0000\u0000\u06b3\u0684\u0001\u0000\u0000\u0000\u06b3\u068b\u0001\u0000"+
		"\u0000\u0000\u06b3\u0692\u0001\u0000\u0000\u0000\u06b4S\u0001\u0000\u0000"+
		"\u0000\u06b5\u06b6\u0005\u00b6\u0000\u0000\u06b6\u06b7\u0005\u001c\u0000"+
		"\u0000\u06b7\u06bc\u0003\\.\u0000\u06b8\u06b9\u0005\u0004\u0000\u0000"+
		"\u06b9\u06bb\u0003\\.\u0000\u06ba\u06b8\u0001\u0000\u0000\u0000\u06bb"+
		"\u06be\u0001\u0000\u0000\u0000\u06bc\u06ba\u0001\u0000\u0000\u0000\u06bc"+
		"\u06bd\u0001\u0000\u0000\u0000\u06bd\u06c0\u0001\u0000\u0000\u0000\u06be"+
		"\u06bc\u0001\u0000\u0000\u0000\u06bf\u06b5\u0001\u0000\u0000\u0000\u06bf"+
		"\u06c0\u0001\u0000\u0000\u0000\u06c0\u06cb\u0001\u0000\u0000\u0000\u06c1"+
		"\u06c2\u0005&\u0000\u0000\u06c2\u06c3\u0005\u001c\u0000\u0000\u06c3\u06c8"+
		"\u0003\u00ecv\u0000\u06c4\u06c5\u0005\u0004\u0000\u0000\u06c5\u06c7\u0003"+
		"\u00ecv\u0000\u06c6\u06c4\u0001\u0000\u0000\u0000\u06c7\u06ca\u0001\u0000"+
		"\u0000\u0000\u06c8\u06c6\u0001\u0000\u0000\u0000\u06c8\u06c9\u0001\u0000"+
		"\u0000\u0000\u06c9\u06cc\u0001\u0000\u0000\u0000\u06ca\u06c8\u0001\u0000"+
		"\u0000\u0000\u06cb\u06c1\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000"+
		"\u0000\u0000\u06cc\u06d7\u0001\u0000\u0000\u0000\u06cd\u06ce\u0005P\u0000"+
		"\u0000\u06ce\u06cf\u0005\u001c\u0000\u0000\u06cf\u06d4\u0003\u00ecv\u0000"+
		"\u06d0\u06d1\u0005\u0004\u0000\u0000\u06d1\u06d3\u0003\u00ecv\u0000\u06d2"+
		"\u06d0\u0001\u0000\u0000\u0000\u06d3\u06d6\u0001\u0000\u0000\u0000\u06d4"+
		"\u06d2\u0001\u0000\u0000\u0000\u06d4\u06d5\u0001\u0000\u0000\u0000\u06d5"+
		"\u06d8\u0001\u0000\u0000\u0000\u06d6\u06d4\u0001\u0000\u0000\u0000\u06d7"+
		"\u06cd\u0001\u0000\u0000\u0000\u06d7\u06d8\u0001\u0000\u0000\u0000\u06d8"+
		"\u06e3\u0001\u0000\u0000\u0000\u06d9\u06da\u0005\u00f5\u0000\u0000\u06da"+
		"\u06db\u0005\u001c\u0000\u0000\u06db\u06e0\u0003\\.\u0000\u06dc\u06dd"+
		"\u0005\u0004\u0000\u0000\u06dd\u06df\u0003\\.\u0000\u06de\u06dc\u0001"+
		"\u0000\u0000\u0000\u06df\u06e2\u0001\u0000\u0000\u0000\u06e0\u06de\u0001"+
		"\u0000\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000\u0000\u06e1\u06e4\u0001"+
		"\u0000\u0000\u0000\u06e2\u06e0\u0001\u0000\u0000\u0000\u06e3\u06d9\u0001"+
		"\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000\u06e4\u06e6\u0001"+
		"\u0000\u0000\u0000\u06e5\u06e7\u0003\u0130\u0098\u0000\u06e6\u06e5\u0001"+
		"\u0000\u0000\u0000\u06e6\u06e7\u0001\u0000\u0000\u0000\u06e7\u06ed\u0001"+
		"\u0000\u0000\u0000\u06e8\u06eb\u0005\u0090\u0000\u0000\u06e9\u06ec\u0005"+
		"\n\u0000\u0000\u06ea\u06ec\u0003\u00ecv\u0000\u06eb\u06e9\u0001\u0000"+
		"\u0000\u0000\u06eb\u06ea\u0001\u0000\u0000\u0000\u06ec\u06ee\u0001\u0000"+
		"\u0000\u0000\u06ed\u06e8\u0001\u0000\u0000\u0000\u06ed\u06ee\u0001\u0000"+
		"\u0000\u0000\u06ee\u06f1\u0001\u0000\u0000\u0000\u06ef\u06f0\u0005\u00b0"+
		"\u0000\u0000\u06f0\u06f2\u0003\u00ecv\u0000\u06f1\u06ef\u0001\u0000\u0000"+
		"\u0000\u06f1\u06f2\u0001\u0000\u0000\u0000\u06f2U\u0001\u0000\u0000\u0000"+
		"\u06f3\u06f4\u0003&\u0013\u0000\u06f4\u06f5\u0003`0\u0000\u06f5W\u0001"+
		"\u0000\u0000\u0000\u06f6\u06f7\u0006,\uffff\uffff\u0000\u06f7\u06f8\u0003"+
		"Z-\u0000\u06f8\u0710\u0001\u0000\u0000\u0000\u06f9\u06fa\n\u0003\u0000"+
		"\u0000\u06fa\u06fb\u0004,\u0001\u0000\u06fb\u06fd\u0007\r\u0000\u0000"+
		"\u06fc\u06fe\u0003\u00aeW\u0000\u06fd\u06fc\u0001\u0000\u0000\u0000\u06fd"+
		"\u06fe\u0001\u0000\u0000\u0000\u06fe\u06ff\u0001\u0000\u0000\u0000\u06ff"+
		"\u070f\u0003X,\u0004\u0700\u0701\n\u0002\u0000\u0000\u0701\u0702\u0004"+
		",\u0003\u0000\u0702\u0704\u0005\u0082\u0000\u0000\u0703\u0705\u0003\u00ae"+
		"W\u0000\u0704\u0703\u0001\u0000\u0000\u0000\u0704\u0705\u0001\u0000\u0000"+
		"\u0000\u0705\u0706\u0001\u0000\u0000\u0000\u0706\u070f\u0003X,\u0003\u0707"+
		"\u0708\n\u0001\u0000\u0000\u0708\u0709\u0004,\u0005\u0000\u0709\u070b"+
		"\u0007\u000e\u0000\u0000\u070a\u070c\u0003\u00aeW\u0000\u070b\u070a\u0001"+
		"\u0000\u0000\u0000\u070b\u070c\u0001\u0000\u0000\u0000\u070c\u070d\u0001"+
		"\u0000\u0000\u0000\u070d\u070f\u0003X,\u0002\u070e\u06f9\u0001\u0000\u0000"+
		"\u0000\u070e\u0700\u0001\u0000\u0000\u0000\u070e\u0707\u0001\u0000\u0000"+
		"\u0000\u070f\u0712\u0001\u0000\u0000\u0000\u0710\u070e\u0001\u0000\u0000"+
		"\u0000\u0710\u0711\u0001\u0000\u0000\u0000\u0711Y\u0001\u0000\u0000\u0000"+
		"\u0712\u0710\u0001\u0000\u0000\u0000\u0713\u071d\u0003b1\u0000\u0714\u071d"+
		"\u0003^/\u0000\u0715\u0716\u0005\u0102\u0000\u0000\u0716\u071d\u0003\u00d6"+
		"k\u0000\u0717\u071d\u0003\u00ccf\u0000\u0718\u0719\u0005\u0002\u0000\u0000"+
		"\u0719\u071a\u0003$\u0012\u0000\u071a\u071b\u0005\u0003\u0000\u0000\u071b"+
		"\u071d\u0001\u0000\u0000\u0000\u071c\u0713\u0001\u0000\u0000\u0000\u071c"+
		"\u0714\u0001\u0000\u0000\u0000\u071c\u0715\u0001\u0000\u0000\u0000\u071c"+
		"\u0717\u0001\u0000\u0000\u0000\u071c\u0718\u0001\u0000\u0000\u0000\u071d"+
		"[\u0001\u0000\u0000\u0000\u071e\u0720\u0003\u00ecv\u0000\u071f\u0721\u0007"+
		"\u000f\u0000\u0000\u0720\u071f\u0001\u0000\u0000\u0000\u0720\u0721\u0001"+
		"\u0000\u0000\u0000\u0721\u0724\u0001\u0000\u0000\u0000\u0722\u0723\u0005"+
		"\u00ae\u0000\u0000\u0723\u0725\u0007\u0010\u0000\u0000\u0724\u0722\u0001"+
		"\u0000\u0000\u0000\u0724\u0725\u0001\u0000\u0000\u0000\u0725]\u0001\u0000"+
		"\u0000\u0000\u0726\u0728\u0003\u0082A\u0000\u0727\u0729\u0003`0\u0000"+
		"\u0728\u0727\u0001\u0000\u0000\u0000\u0729\u072a\u0001\u0000\u0000\u0000"+
		"\u072a\u0728\u0001\u0000\u0000\u0000\u072a\u072b\u0001\u0000\u0000\u0000"+
		"\u072b_\u0001\u0000\u0000\u0000\u072c\u072e\u0003d2\u0000\u072d\u072f"+
		"\u0003z=\u0000\u072e\u072d\u0001\u0000\u0000\u0000\u072e\u072f\u0001\u0000"+
		"\u0000\u0000\u072f\u0730\u0001\u0000\u0000\u0000\u0730\u0731\u0003T*\u0000"+
		"\u0731\u0748\u0001\u0000\u0000\u0000\u0732\u0736\u0003f3\u0000\u0733\u0735"+
		"\u0003\u00acV\u0000\u0734\u0733\u0001\u0000\u0000\u0000\u0735\u0738\u0001"+
		"\u0000\u0000\u0000\u0736\u0734\u0001\u0000\u0000\u0000\u0736\u0737\u0001"+
		"\u0000\u0000\u0000\u0737\u073a\u0001\u0000\u0000\u0000\u0738\u0736\u0001"+
		"\u0000\u0000\u0000\u0739\u073b\u0003z=\u0000\u073a\u0739\u0001\u0000\u0000"+
		"\u0000\u073a\u073b\u0001\u0000\u0000\u0000\u073b\u073d\u0001\u0000\u0000"+
		"\u0000\u073c\u073e\u0003\u0086C\u0000\u073d\u073c\u0001\u0000\u0000\u0000"+
		"\u073d\u073e\u0001\u0000\u0000\u0000\u073e\u0740\u0001\u0000\u0000\u0000"+
		"\u073f\u0741\u0003|>\u0000\u0740\u073f\u0001\u0000\u0000\u0000\u0740\u0741"+
		"\u0001\u0000\u0000\u0000\u0741\u0743\u0001\u0000\u0000\u0000\u0742\u0744"+
		"\u0003\u0130\u0098\u0000\u0743\u0742\u0001\u0000\u0000\u0000\u0743\u0744"+
		"\u0001\u0000\u0000\u0000\u0744\u0745\u0001\u0000\u0000\u0000\u0745\u0746"+
		"\u0003T*\u0000\u0746\u0748\u0001\u0000\u0000\u0000\u0747\u072c\u0001\u0000"+
		"\u0000\u0000\u0747\u0732\u0001\u0000\u0000\u0000\u0748a\u0001\u0000\u0000"+
		"\u0000\u0749\u074b\u0003d2\u0000\u074a\u074c\u0003\u0082A\u0000\u074b"+
		"\u074a\u0001\u0000\u0000\u0000\u074b\u074c\u0001\u0000\u0000\u0000\u074c"+
		"\u0750\u0001\u0000\u0000\u0000\u074d\u074f\u0003\u00acV\u0000\u074e\u074d"+
		"\u0001\u0000\u0000\u0000\u074f\u0752\u0001\u0000\u0000\u0000\u0750\u074e"+
		"\u0001\u0000\u0000\u0000\u0750\u0751\u0001\u0000\u0000\u0000\u0751\u0754"+
		"\u0001\u0000\u0000\u0000\u0752\u0750\u0001\u0000\u0000\u0000\u0753\u0755"+
		"\u0003z=\u0000\u0754\u0753\u0001\u0000\u0000\u0000\u0754\u0755\u0001\u0000"+
		"\u0000\u0000\u0755\u0757\u0001\u0000\u0000\u0000\u0756\u0758\u0003\u0086"+
		"C\u0000\u0757\u0756\u0001\u0000\u0000\u0000\u0757\u0758\u0001\u0000\u0000"+
		"\u0000\u0758\u075a\u0001\u0000\u0000\u0000\u0759\u075b\u0003|>\u0000\u075a"+
		"\u0759\u0001\u0000\u0000\u0000\u075a\u075b\u0001\u0000\u0000\u0000\u075b"+
		"\u075d\u0001\u0000\u0000\u0000\u075c\u075e\u0003\u0130\u0098\u0000\u075d"+
		"\u075c\u0001\u0000\u0000\u0000\u075d\u075e\u0001\u0000\u0000\u0000\u075e"+
		"\u0776\u0001\u0000\u0000\u0000\u075f\u0761\u0003f3\u0000\u0760\u0762\u0003"+
		"\u0082A\u0000\u0761\u0760\u0001\u0000\u0000\u0000\u0761\u0762\u0001\u0000"+
		"\u0000\u0000\u0762\u0766\u0001\u0000\u0000\u0000\u0763\u0765\u0003\u00ac"+
		"V\u0000\u0764\u0763\u0001\u0000\u0000\u0000\u0765\u0768\u0001\u0000\u0000"+
		"\u0000\u0766\u0764\u0001\u0000\u0000\u0000\u0766\u0767\u0001\u0000\u0000"+
		"\u0000\u0767\u076a\u0001\u0000\u0000\u0000\u0768\u0766\u0001\u0000\u0000"+
		"\u0000\u0769\u076b\u0003z=\u0000\u076a\u0769\u0001\u0000\u0000\u0000\u076a"+
		"\u076b\u0001\u0000\u0000\u0000\u076b\u076d\u0001\u0000\u0000\u0000\u076c"+
		"\u076e\u0003\u0086C\u0000\u076d\u076c\u0001\u0000\u0000\u0000\u076d\u076e"+
		"\u0001\u0000\u0000\u0000\u076e\u0770\u0001\u0000\u0000\u0000\u076f\u0771"+
		"\u0003|>\u0000\u0770\u076f\u0001\u0000\u0000\u0000\u0770\u0771\u0001\u0000"+
		"\u0000\u0000\u0771\u0773\u0001\u0000\u0000\u0000\u0772\u0774\u0003\u0130"+
		"\u0098\u0000\u0773\u0772\u0001\u0000\u0000\u0000\u0773\u0774\u0001\u0000"+
		"\u0000\u0000\u0774\u0776\u0001\u0000\u0000\u0000\u0775\u0749\u0001\u0000"+
		"\u0000\u0000\u0775\u075f\u0001\u0000\u0000\u0000\u0776c\u0001\u0000\u0000"+
		"\u0000\u0777\u0778\u0005\u00e9\u0000\u0000\u0778\u0779\u0005\u0113\u0000"+
		"\u0000\u0779\u077b\u0005\u0002\u0000\u0000\u077a\u077c\u0003\u00aeW\u0000"+
		"\u077b\u077a\u0001\u0000\u0000\u0000\u077b\u077c\u0001\u0000\u0000\u0000"+
		"\u077c\u077d\u0001\u0000\u0000\u0000\u077d\u077e\u0003\u00eew\u0000\u077e"+
		"\u077f\u0005\u0003\u0000\u0000\u077f\u078b\u0001\u0000\u0000\u0000\u0780"+
		"\u0782\u0005\u009a\u0000\u0000\u0781\u0783\u0003\u00aeW\u0000\u0782\u0781"+
		"\u0001\u0000\u0000\u0000\u0782\u0783\u0001\u0000\u0000\u0000\u0783\u0784"+
		"\u0001\u0000\u0000\u0000\u0784\u078b\u0003\u00eew\u0000\u0785\u0787\u0005"+
		"\u00d2\u0000\u0000\u0786\u0788\u0003\u00aeW\u0000\u0787\u0786\u0001\u0000"+
		"\u0000\u0000\u0787\u0788\u0001\u0000\u0000\u0000\u0788\u0789\u0001\u0000"+
		"\u0000\u0000\u0789\u078b\u0003\u00eew\u0000\u078a\u0777\u0001\u0000\u0000"+
		"\u0000\u078a\u0780\u0001\u0000\u0000\u0000\u078a\u0785\u0001\u0000\u0000"+
		"\u0000\u078b\u078d\u0001\u0000\u0000\u0000\u078c\u078e\u0003\u00d2i\u0000"+
		"\u078d\u078c\u0001\u0000\u0000\u0000\u078d\u078e\u0001\u0000\u0000\u0000"+
		"\u078e\u0791\u0001\u0000\u0000\u0000\u078f\u0790\u0005\u00d0\u0000\u0000"+
		"\u0790\u0792\u0003\u0150\u00a8\u0000\u0791\u078f\u0001\u0000\u0000\u0000"+
		"\u0791\u0792\u0001\u0000\u0000\u0000\u0792\u0793\u0001\u0000\u0000\u0000"+
		"\u0793\u0794\u0005\u0125\u0000\u0000\u0794\u07a1\u0003\u0150\u00a8\u0000"+
		"\u0795\u079f\u0005\u0014\u0000\u0000\u0796\u07a0\u0003\u00c0`\u0000\u0797"+
		"\u07a0\u0003\u011e\u008f\u0000\u0798\u079b\u0005\u0002\u0000\u0000\u0799"+
		"\u079c\u0003\u00c0`\u0000\u079a\u079c\u0003\u011e\u008f\u0000\u079b\u0799"+
		"\u0001\u0000\u0000\u0000\u079b\u079a\u0001\u0000\u0000\u0000\u079c\u079d"+
		"\u0001\u0000\u0000\u0000\u079d\u079e\u0005\u0003\u0000\u0000\u079e\u07a0"+
		"\u0001\u0000\u0000\u0000\u079f\u0796\u0001\u0000\u0000\u0000\u079f\u0797"+
		"\u0001\u0000\u0000\u0000\u079f\u0798\u0001\u0000\u0000\u0000\u07a0\u07a2"+
		"\u0001\u0000\u0000\u0000\u07a1\u0795\u0001\u0000\u0000\u0000\u07a1\u07a2"+
		"\u0001\u0000\u0000\u0000\u07a2\u07a4\u0001\u0000\u0000\u0000\u07a3\u07a5"+
		"\u0003\u00d2i\u0000\u07a4\u07a3\u0001\u0000\u0000\u0000\u07a4\u07a5\u0001"+
		"\u0000\u0000\u0000\u07a5\u07a8\u0001\u0000\u0000\u0000\u07a6\u07a7\u0005"+
		"\u00cf\u0000\u0000\u07a7\u07a9\u0003\u0150\u00a8\u0000\u07a8\u07a6\u0001"+
		"\u0000\u0000\u0000\u07a8\u07a9\u0001\u0000\u0000\u0000\u07a9e\u0001\u0000"+
		"\u0000\u0000\u07aa\u07ae\u0005\u00e9\u0000\u0000\u07ab\u07ad\u0003~?\u0000"+
		"\u07ac\u07ab\u0001\u0000\u0000\u0000\u07ad\u07b0\u0001\u0000\u0000\u0000"+
		"\u07ae\u07ac\u0001\u0000\u0000\u0000\u07ae\u07af\u0001\u0000\u0000\u0000"+
		"\u07af\u07b2\u0001\u0000\u0000\u0000\u07b0\u07ae\u0001\u0000\u0000\u0000"+
		"\u07b1\u07b3\u0003\u00aeW\u0000\u07b2\u07b1\u0001\u0000\u0000\u0000\u07b2"+
		"\u07b3\u0001\u0000\u0000\u0000\u07b3\u07b4\u0001\u0000\u0000\u0000\u07b4"+
		"\u07b5\u0003\u00e2q\u0000\u07b5g\u0001\u0000\u0000\u0000\u07b6\u07b7\u0005"+
		"\u00ef\u0000\u0000\u07b7\u07b8\u0003v;\u0000\u07b8i\u0001\u0000\u0000"+
		"\u0000\u07b9\u07ba\u0005\u012c\u0000\u0000\u07ba\u07bd\u0005\u009b\u0000"+
		"\u0000\u07bb\u07bc\u0005\u000e\u0000\u0000\u07bc\u07be\u0003\u00f0x\u0000"+
		"\u07bd\u07bb\u0001\u0000\u0000\u0000\u07bd\u07be\u0001\u0000\u0000\u0000"+
		"\u07be\u07bf\u0001\u0000\u0000\u0000\u07bf\u07c0\u0005\u0109\u0000\u0000"+
		"\u07c0\u07c1\u0003p8\u0000\u07c1k\u0001\u0000\u0000\u0000\u07c2\u07c3"+
		"\u0005\u012c\u0000\u0000\u07c3\u07c4\u0005\u00ac\u0000\u0000\u07c4\u07c7"+
		"\u0005\u009b\u0000\u0000\u07c5\u07c6\u0005\u001c\u0000\u0000\u07c6\u07c8"+
		"\u0005\u0105\u0000\u0000\u07c7\u07c5\u0001\u0000\u0000\u0000\u07c7\u07c8"+
		"\u0001\u0000\u0000\u0000\u07c8\u07cb\u0001\u0000\u0000\u0000\u07c9\u07ca"+
		"\u0005\u000e\u0000\u0000\u07ca\u07cc\u0003\u00f0x\u0000\u07cb\u07c9\u0001"+
		"\u0000\u0000\u0000\u07cb\u07cc\u0001\u0000\u0000\u0000\u07cc\u07cd\u0001"+
		"\u0000\u0000\u0000\u07cd\u07ce\u0005\u0109\u0000\u0000\u07ce\u07cf\u0003"+
		"r9\u0000\u07cfm\u0001\u0000\u0000\u0000\u07d0\u07d1\u0005\u012c\u0000"+
		"\u0000\u07d1\u07d2\u0005\u00ac\u0000\u0000\u07d2\u07d3\u0005\u009b\u0000"+
		"\u0000\u07d3\u07d4\u0005\u001c\u0000\u0000\u07d4\u07d7\u0005\u00f7\u0000"+
		"\u0000\u07d5\u07d6\u0005\u000e\u0000\u0000\u07d6\u07d8\u0003\u00f0x\u0000"+
		"\u07d7\u07d5\u0001\u0000\u0000\u0000\u07d7\u07d8\u0001\u0000\u0000\u0000"+
		"\u07d8\u07d9\u0001\u0000\u0000\u0000\u07d9\u07da\u0005\u0109\u0000\u0000"+
		"\u07da\u07db\u0003";
	private static final String _serializedATNSegment1 =
		"t:\u0000\u07dbo\u0001\u0000\u0000\u0000\u07dc\u07e4\u0005H\u0000\u0000"+
		"\u07dd\u07de\u0005\u0122\u0000\u0000\u07de\u07df\u0005\u00ef\u0000\u0000"+
		"\u07df\u07e4\u0005\u013e\u0000\u0000\u07e0\u07e1\u0005\u0122\u0000\u0000"+
		"\u07e1\u07e2\u0005\u00ef\u0000\u0000\u07e2\u07e4\u0003v;\u0000\u07e3\u07dc"+
		"\u0001\u0000\u0000\u0000\u07e3\u07dd\u0001\u0000\u0000\u0000\u07e3\u07e0"+
		"\u0001\u0000\u0000\u0000\u07e4q\u0001\u0000\u0000\u0000\u07e5\u07e6\u0005"+
		"\u0081\u0000\u0000\u07e6\u07f8\u0005\u013e\u0000\u0000\u07e7\u07e8\u0005"+
		"\u0081\u0000\u0000\u07e8\u07e9\u0005\u0002\u0000\u0000\u07e9\u07ea\u0003"+
		"\u00d4j\u0000\u07ea\u07eb\u0005\u0003\u0000\u0000\u07eb\u07ec\u0005\u0126"+
		"\u0000\u0000\u07ec\u07ed\u0005\u0002\u0000\u0000\u07ed\u07f2\u0003\u00ec"+
		"v\u0000\u07ee\u07ef\u0005\u0004\u0000\u0000\u07ef\u07f1\u0003\u00ecv\u0000"+
		"\u07f0\u07ee\u0001\u0000\u0000\u0000\u07f1\u07f4\u0001\u0000\u0000\u0000"+
		"\u07f2\u07f0\u0001\u0000\u0000\u0000\u07f2\u07f3\u0001\u0000\u0000\u0000"+
		"\u07f3\u07f5\u0001\u0000\u0000\u0000\u07f4\u07f2\u0001\u0000\u0000\u0000"+
		"\u07f5\u07f6\u0005\u0003\u0000\u0000\u07f6\u07f8\u0001\u0000\u0000\u0000"+
		"\u07f7\u07e5\u0001\u0000\u0000\u0000\u07f7\u07e7\u0001\u0000\u0000\u0000"+
		"\u07f8s\u0001\u0000\u0000\u0000\u07f9\u07fe\u0005H\u0000\u0000\u07fa\u07fb"+
		"\u0005\u0122\u0000\u0000\u07fb\u07fc\u0005\u00ef\u0000\u0000\u07fc\u07fe"+
		"\u0003v;\u0000\u07fd\u07f9\u0001\u0000\u0000\u0000\u07fd\u07fa\u0001\u0000"+
		"\u0000\u0000\u07feu\u0001\u0000\u0000\u0000\u07ff\u0804\u0003x<\u0000"+
		"\u0800\u0801\u0005\u0004\u0000\u0000\u0801\u0803\u0003x<\u0000\u0802\u0800"+
		"\u0001\u0000\u0000\u0000\u0803\u0806\u0001\u0000\u0000\u0000\u0804\u0802"+
		"\u0001\u0000\u0000\u0000\u0804\u0805\u0001\u0000\u0000\u0000\u0805w\u0001"+
		"\u0000\u0000\u0000\u0806\u0804\u0001\u0000\u0000\u0000\u0807\u0808\u0003"+
		"\u00d6k\u0000\u0808\u0809\u0005\u0134\u0000\u0000\u0809\u080a\u0003\u00ec"+
		"v\u0000\u080ay\u0001\u0000\u0000\u0000\u080b\u080c\u0005\u012d\u0000\u0000"+
		"\u080c\u080d\u0003\u00f0x\u0000\u080d{\u0001\u0000\u0000\u0000\u080e\u080f"+
		"\u0005t\u0000\u0000\u080f\u0810\u0003\u00f0x\u0000\u0810}\u0001\u0000"+
		"\u0000\u0000\u0811\u0812\u0005\u0148\u0000\u0000\u0812\u0819\u0003\u0080"+
		"@\u0000\u0813\u0815\u0005\u0004\u0000\u0000\u0814\u0813\u0001\u0000\u0000"+
		"\u0000\u0814\u0815\u0001\u0000\u0000\u0000\u0815\u0816\u0001\u0000\u0000"+
		"\u0000\u0816\u0818\u0003\u0080@\u0000\u0817\u0814\u0001\u0000\u0000\u0000"+
		"\u0818\u081b\u0001\u0000\u0000\u0000\u0819\u0817\u0001\u0000\u0000\u0000"+
		"\u0819\u081a\u0001\u0000\u0000\u0000\u081a\u081c\u0001\u0000\u0000\u0000"+
		"\u081b\u0819\u0001\u0000\u0000\u0000\u081c\u081d\u0005\u0149\u0000\u0000"+
		"\u081d\u007f\u0001\u0000\u0000\u0000\u081e\u082c\u0003\u0144\u00a2\u0000"+
		"\u081f\u0820\u0003\u0144\u00a2\u0000\u0820\u0821\u0005\u0002\u0000\u0000"+
		"\u0821\u0826\u0003\u00f8|\u0000\u0822\u0823\u0005\u0004\u0000\u0000\u0823"+
		"\u0825\u0003\u00f8|\u0000\u0824\u0822\u0001\u0000\u0000\u0000\u0825\u0828"+
		"\u0001\u0000\u0000\u0000\u0826\u0824\u0001\u0000\u0000\u0000\u0826\u0827"+
		"\u0001\u0000\u0000\u0000\u0827\u0829\u0001\u0000\u0000\u0000\u0828\u0826"+
		"\u0001\u0000\u0000\u0000\u0829\u082a\u0005\u0003\u0000\u0000\u082a\u082c"+
		"\u0001\u0000\u0000\u0000\u082b\u081e\u0001\u0000\u0000\u0000\u082b\u081f"+
		"\u0001\u0000\u0000\u0000\u082c\u0081\u0001\u0000\u0000\u0000\u082d\u082e"+
		"\u0005k\u0000\u0000\u082e\u0833\u0003\u00b0X\u0000\u082f\u0830\u0005\u0004"+
		"\u0000\u0000\u0830\u0832\u0003\u00b0X\u0000\u0831\u082f\u0001\u0000\u0000"+
		"\u0000\u0832\u0835\u0001\u0000\u0000\u0000\u0833\u0831\u0001\u0000\u0000"+
		"\u0000\u0833\u0834\u0001\u0000\u0000\u0000\u0834\u0839\u0001\u0000\u0000"+
		"\u0000\u0835\u0833\u0001\u0000\u0000\u0000\u0836\u0838\u0003\u00acV\u0000"+
		"\u0837\u0836\u0001\u0000\u0000\u0000\u0838\u083b\u0001\u0000\u0000\u0000"+
		"\u0839\u0837\u0001\u0000\u0000\u0000\u0839\u083a\u0001\u0000\u0000\u0000"+
		"\u083a\u083d\u0001\u0000\u0000\u0000\u083b\u0839\u0001\u0000\u0000\u0000"+
		"\u083c\u083e\u0003\u0090H\u0000\u083d\u083c\u0001\u0000\u0000\u0000\u083d"+
		"\u083e\u0001\u0000\u0000\u0000\u083e\u0840\u0001\u0000\u0000\u0000\u083f"+
		"\u0841\u0003\u0096K\u0000\u0840\u083f\u0001\u0000\u0000\u0000\u0840\u0841"+
		"\u0001\u0000\u0000\u0000\u0841\u0083\u0001\u0000\u0000\u0000\u0842\u0844"+
		"\u0005g\u0000\u0000\u0843\u0842\u0001\u0000\u0000\u0000\u0843\u0844\u0001"+
		"\u0000\u0000\u0000\u0844\u0845\u0001\u0000\u0000\u0000\u0845\u0846\u0007"+
		"\u0011\u0000\u0000\u0846\u0847\u0005\u0014\u0000\u0000\u0847\u0848\u0005"+
		"\u00af\u0000\u0000\u0848\u0851\u0003\u0154\u00aa\u0000\u0849\u084b\u0005"+
		"g\u0000\u0000\u084a\u0849\u0001\u0000\u0000\u0000\u084a\u084b\u0001\u0000"+
		"\u0000\u0000\u084b\u084c\u0001\u0000\u0000\u0000\u084c\u084d\u0007\u0012"+
		"\u0000\u0000\u084d\u084e\u0005\u0014\u0000\u0000\u084e\u084f\u0005\u00af"+
		"\u0000\u0000\u084f\u0851\u0003\u00f4z\u0000\u0850\u0843\u0001\u0000\u0000"+
		"\u0000\u0850\u084a\u0001\u0000\u0000\u0000\u0851\u0085\u0001\u0000\u0000"+
		"\u0000\u0852\u0853\u0005r\u0000\u0000\u0853\u0854\u0005\u001c\u0000\u0000"+
		"\u0854\u0859\u0003\u0088D\u0000\u0855\u0856\u0005\u0004\u0000\u0000\u0856"+
		"\u0858\u0003\u0088D\u0000\u0857\u0855\u0001\u0000\u0000\u0000\u0858\u085b"+
		"\u0001\u0000\u0000\u0000\u0859\u0857\u0001\u0000\u0000\u0000\u0859\u085a"+
		"\u0001\u0000\u0000\u0000\u085a\u087a\u0001\u0000\u0000\u0000\u085b\u0859"+
		"\u0001\u0000\u0000\u0000\u085c\u085d\u0005r\u0000\u0000\u085d\u085e\u0005"+
		"\u001c\u0000\u0000\u085e\u0863\u0003\u00ecv\u0000\u085f\u0860\u0005\u0004"+
		"\u0000\u0000\u0860\u0862\u0003\u00ecv\u0000\u0861\u085f\u0001\u0000\u0000"+
		"\u0000\u0862\u0865\u0001\u0000\u0000\u0000\u0863\u0861\u0001\u0000\u0000"+
		"\u0000\u0863\u0864\u0001\u0000\u0000\u0000\u0864\u0877\u0001\u0000\u0000"+
		"\u0000\u0865\u0863\u0001\u0000\u0000\u0000\u0866\u0867\u0005\u012f\u0000"+
		"\u0000\u0867\u0878\u0005\u00e2\u0000\u0000\u0868\u0869\u0005\u012f\u0000"+
		"\u0000\u0869\u0878\u00057\u0000\u0000\u086a\u086b\u0005s\u0000\u0000\u086b"+
		"\u086c\u0005\u00f1\u0000\u0000\u086c\u086d\u0005\u0002\u0000\u0000\u086d"+
		"\u0872\u0003\u008eG\u0000\u086e\u086f\u0005\u0004\u0000\u0000\u086f\u0871"+
		"\u0003\u008eG\u0000\u0870\u086e\u0001\u0000\u0000\u0000\u0871\u0874\u0001"+
		"\u0000\u0000\u0000\u0872\u0870\u0001\u0000\u0000\u0000\u0872\u0873\u0001"+
		"\u0000\u0000\u0000\u0873\u0875\u0001\u0000\u0000\u0000\u0874\u0872\u0001"+
		"\u0000\u0000\u0000\u0875\u0876\u0005\u0003\u0000\u0000\u0876\u0878\u0001"+
		"\u0000\u0000\u0000\u0877\u0866\u0001\u0000\u0000\u0000\u0877\u0868\u0001"+
		"\u0000\u0000\u0000\u0877\u086a\u0001\u0000\u0000\u0000\u0877\u0878\u0001"+
		"\u0000\u0000\u0000\u0878\u087a\u0001\u0000\u0000\u0000\u0879\u0852\u0001"+
		"\u0000\u0000\u0000\u0879\u085c\u0001\u0000\u0000\u0000\u087a\u0087\u0001"+
		"\u0000\u0000\u0000\u087b\u087e\u0003\u008aE\u0000\u087c\u087e\u0003\u00ec"+
		"v\u0000\u087d\u087b\u0001\u0000\u0000\u0000\u087d\u087c\u0001\u0000\u0000"+
		"\u0000\u087e\u0089\u0001\u0000\u0000\u0000\u087f\u0880\u0007\u0013\u0000"+
		"\u0000\u0880\u0881\u0005\u0002\u0000\u0000\u0881\u0886\u0003\u008eG\u0000"+
		"\u0882\u0883\u0005\u0004\u0000\u0000\u0883\u0885\u0003\u008eG\u0000\u0884"+
		"\u0882\u0001\u0000\u0000\u0000\u0885\u0888\u0001\u0000\u0000\u0000\u0886"+
		"\u0884\u0001\u0000\u0000\u0000\u0886\u0887\u0001\u0000\u0000\u0000\u0887"+
		"\u0889\u0001\u0000\u0000\u0000\u0888\u0886\u0001\u0000\u0000\u0000\u0889"+
		"\u088a\u0005\u0003\u0000\u0000\u088a\u0899\u0001\u0000\u0000\u0000\u088b"+
		"\u088c\u0005s\u0000\u0000\u088c\u088d\u0005\u00f1\u0000\u0000\u088d\u088e"+
		"\u0005\u0002\u0000\u0000\u088e\u0893\u0003\u008cF\u0000\u088f\u0890\u0005"+
		"\u0004\u0000\u0000\u0890\u0892\u0003\u008cF\u0000\u0891\u088f\u0001\u0000"+
		"\u0000\u0000\u0892\u0895\u0001\u0000\u0000\u0000\u0893\u0891\u0001\u0000"+
		"\u0000\u0000\u0893\u0894\u0001\u0000\u0000\u0000\u0894\u0896\u0001\u0000"+
		"\u0000\u0000\u0895\u0893\u0001\u0000\u0000\u0000\u0896\u0897\u0005\u0003"+
		"\u0000\u0000\u0897\u0899\u0001\u0000\u0000\u0000\u0898\u087f\u0001\u0000"+
		"\u0000\u0000\u0898\u088b\u0001\u0000\u0000\u0000\u0899\u008b\u0001\u0000"+
		"\u0000\u0000\u089a\u089d\u0003\u008aE\u0000\u089b\u089d\u0003\u008eG\u0000"+
		"\u089c\u089a\u0001\u0000\u0000\u0000\u089c\u089b\u0001\u0000\u0000\u0000"+
		"\u089d\u008d\u0001\u0000\u0000\u0000\u089e\u08a7\u0005\u0002\u0000\u0000"+
		"\u089f\u08a4\u0003\u00ecv\u0000\u08a0\u08a1\u0005\u0004\u0000\u0000\u08a1"+
		"\u08a3\u0003\u00ecv\u0000\u08a2\u08a0\u0001\u0000\u0000\u0000\u08a3\u08a6"+
		"\u0001\u0000\u0000\u0000\u08a4\u08a2\u0001\u0000\u0000\u0000\u08a4\u08a5"+
		"\u0001\u0000\u0000\u0000\u08a5\u08a8\u0001\u0000\u0000\u0000\u08a6\u08a4"+
		"\u0001\u0000\u0000\u0000\u08a7\u089f\u0001\u0000\u0000\u0000\u08a7\u08a8"+
		"\u0001\u0000\u0000\u0000\u08a8\u08a9\u0001\u0000\u0000\u0000\u08a9\u08ac"+
		"\u0005\u0003\u0000\u0000\u08aa\u08ac\u0003\u00ecv\u0000\u08ab\u089e\u0001"+
		"\u0000\u0000\u0000\u08ab\u08aa\u0001\u0000\u0000\u0000\u08ac\u008f\u0001"+
		"\u0000\u0000\u0000\u08ad\u08ae\u0005\u00c4\u0000\u0000\u08ae\u08af\u0005"+
		"\u0002\u0000\u0000\u08af\u08b0\u0003\u00e2q\u0000\u08b0\u08b1\u0005g\u0000"+
		"\u0000\u08b1\u08b2\u0003\u0092I\u0000\u08b2\u08b3\u0005z\u0000\u0000\u08b3"+
		"\u08b4\u0005\u0002\u0000\u0000\u08b4\u08b9\u0003\u0094J\u0000\u08b5\u08b6"+
		"\u0005\u0004\u0000\u0000\u08b6\u08b8\u0003\u0094J\u0000\u08b7\u08b5\u0001"+
		"\u0000\u0000\u0000\u08b8\u08bb\u0001\u0000\u0000\u0000\u08b9\u08b7\u0001"+
		"\u0000\u0000\u0000\u08b9\u08ba\u0001\u0000\u0000\u0000\u08ba\u08bc\u0001"+
		"\u0000\u0000\u0000\u08bb\u08b9\u0001\u0000\u0000\u0000\u08bc\u08bd\u0005"+
		"\u0003\u0000\u0000\u08bd\u08be\u0005\u0003\u0000\u0000\u08be\u0091\u0001"+
		"\u0000\u0000\u0000\u08bf\u08cc\u0003\u0144\u00a2\u0000\u08c0\u08c1\u0005"+
		"\u0002\u0000\u0000\u08c1\u08c6\u0003\u0144\u00a2\u0000\u08c2\u08c3\u0005"+
		"\u0004\u0000\u0000\u08c3\u08c5\u0003\u0144\u00a2\u0000\u08c4\u08c2\u0001"+
		"\u0000\u0000\u0000\u08c5\u08c8\u0001\u0000\u0000\u0000\u08c6\u08c4\u0001"+
		"\u0000\u0000\u0000\u08c6\u08c7\u0001\u0000\u0000\u0000\u08c7\u08c9\u0001"+
		"\u0000\u0000\u0000\u08c8\u08c6\u0001\u0000\u0000\u0000\u08c9\u08ca\u0005"+
		"\u0003\u0000\u0000\u08ca\u08cc\u0001\u0000\u0000\u0000\u08cb\u08bf\u0001"+
		"\u0000\u0000\u0000\u08cb\u08c0\u0001\u0000\u0000\u0000\u08cc\u0093\u0001"+
		"\u0000\u0000\u0000\u08cd\u08d2\u0003\u00ecv\u0000\u08ce\u08d0\u0005\u0014"+
		"\u0000\u0000\u08cf\u08ce\u0001\u0000\u0000\u0000\u08cf\u08d0\u0001\u0000"+
		"\u0000\u0000\u08d0\u08d1\u0001\u0000\u0000\u0000\u08d1\u08d3\u0003\u0144"+
		"\u00a2\u0000\u08d2\u08cf\u0001\u0000\u0000\u0000\u08d2\u08d3\u0001\u0000"+
		"\u0000\u0000\u08d3\u0095\u0001\u0000\u0000\u0000\u08d4\u08d6\u0005\u0120"+
		"\u0000\u0000\u08d5\u08d7\u0003\u0098L\u0000\u08d6\u08d5\u0001\u0000\u0000"+
		"\u0000\u08d6\u08d7\u0001\u0000\u0000\u0000\u08d7\u08d8\u0001\u0000\u0000"+
		"\u0000\u08d8\u08d9\u0005\u0002\u0000\u0000\u08d9\u08da\u0003\u009aM\u0000"+
		"\u08da\u08df\u0005\u0003\u0000\u0000\u08db\u08dd\u0005\u0014\u0000\u0000"+
		"\u08dc\u08db\u0001\u0000\u0000\u0000\u08dc\u08dd\u0001\u0000\u0000\u0000"+
		"\u08dd\u08de\u0001\u0000\u0000\u0000\u08de\u08e0\u0003\u0144\u00a2\u0000"+
		"\u08df\u08dc\u0001\u0000\u0000\u0000\u08df\u08e0\u0001\u0000\u0000\u0000"+
		"\u08e0\u0097\u0001\u0000\u0000\u0000\u08e1\u08e2\u0007\u0014\u0000\u0000"+
		"\u08e2\u08e3\u0005\u00ae\u0000\u0000\u08e3\u0099\u0001\u0000\u0000\u0000"+
		"\u08e4\u08e7\u0003\u009cN\u0000\u08e5\u08e7\u0003\u009eO\u0000\u08e6\u08e4"+
		"\u0001\u0000\u0000\u0000\u08e6\u08e5\u0001\u0000\u0000\u0000\u08e7\u009b"+
		"\u0001\u0000\u0000\u0000\u08e8\u08e9\u0003\u00a2Q\u0000\u08e9\u08ea\u0005"+
		"g\u0000\u0000\u08ea\u08eb\u0003\u00a4R\u0000\u08eb\u08ec\u0005z\u0000"+
		"\u0000\u08ec\u08ed\u0005\u0002\u0000\u0000\u08ed\u08f2\u0003\u00a6S\u0000"+
		"\u08ee\u08ef\u0005\u0004\u0000\u0000\u08ef\u08f1\u0003\u00a6S\u0000\u08f0"+
		"\u08ee\u0001\u0000\u0000\u0000\u08f1\u08f4\u0001\u0000\u0000\u0000\u08f2"+
		"\u08f0\u0001\u0000\u0000\u0000\u08f2\u08f3\u0001\u0000\u0000\u0000\u08f3"+
		"\u08f5\u0001\u0000\u0000\u0000\u08f4\u08f2\u0001\u0000\u0000\u0000\u08f5"+
		"\u08f6\u0005\u0003\u0000\u0000\u08f6\u009d\u0001\u0000\u0000\u0000\u08f7"+
		"\u08f8\u0005\u0002\u0000\u0000\u08f8\u08fd\u0003\u00a2Q\u0000\u08f9\u08fa"+
		"\u0005\u0004\u0000\u0000\u08fa\u08fc\u0003\u00a2Q\u0000\u08fb\u08f9\u0001"+
		"\u0000\u0000\u0000\u08fc\u08ff\u0001\u0000\u0000\u0000\u08fd\u08fb\u0001"+
		"\u0000\u0000\u0000\u08fd\u08fe\u0001\u0000\u0000\u0000\u08fe\u0900\u0001"+
		"\u0000\u0000\u0000\u08ff\u08fd\u0001\u0000\u0000\u0000\u0900\u0901\u0005"+
		"\u0003\u0000\u0000\u0901\u0902\u0005g\u0000\u0000\u0902\u0903\u0003\u00a4"+
		"R\u0000\u0903\u0904\u0005z\u0000\u0000\u0904\u0905\u0005\u0002\u0000\u0000"+
		"\u0905\u090a\u0003\u00a0P\u0000\u0906\u0907\u0005\u0004\u0000\u0000\u0907"+
		"\u0909\u0003\u00a0P\u0000\u0908\u0906\u0001\u0000\u0000\u0000\u0909\u090c"+
		"\u0001\u0000\u0000\u0000\u090a\u0908\u0001\u0000\u0000\u0000\u090a\u090b"+
		"\u0001\u0000\u0000\u0000\u090b\u090d\u0001\u0000\u0000\u0000\u090c\u090a"+
		"\u0001\u0000\u0000\u0000\u090d\u090e\u0005\u0003\u0000\u0000\u090e\u009f"+
		"\u0001\u0000\u0000\u0000\u090f\u0910\u0005\u0002\u0000\u0000\u0910\u0915"+
		"\u0003\u00a8T\u0000\u0911\u0912\u0005\u0004\u0000\u0000\u0912\u0914\u0003"+
		"\u00a8T\u0000\u0913\u0911\u0001\u0000\u0000\u0000\u0914\u0917\u0001\u0000"+
		"\u0000\u0000\u0915\u0913\u0001\u0000\u0000\u0000\u0915\u0916\u0001\u0000"+
		"\u0000\u0000\u0916\u0918\u0001\u0000\u0000\u0000\u0917\u0915\u0001\u0000"+
		"\u0000\u0000\u0918\u091a\u0005\u0003\u0000\u0000\u0919\u091b\u0003\u00aa"+
		"U\u0000\u091a\u0919\u0001\u0000\u0000\u0000\u091a\u091b\u0001\u0000\u0000"+
		"\u0000\u091b\u00a1\u0001\u0000\u0000\u0000\u091c\u091d\u0003\u0144\u00a2"+
		"\u0000\u091d\u00a3\u0001\u0000\u0000\u0000\u091e\u091f\u0003\u0144\u00a2"+
		"\u0000\u091f\u00a5\u0001\u0000\u0000\u0000\u0920\u0922\u0003\u00a8T\u0000"+
		"\u0921\u0923\u0003\u00aaU\u0000\u0922\u0921\u0001\u0000\u0000\u0000\u0922"+
		"\u0923\u0001\u0000\u0000\u0000\u0923\u00a7\u0001\u0000\u0000\u0000\u0924"+
		"\u0925\u0003\u00d6k\u0000\u0925\u00a9\u0001\u0000\u0000\u0000\u0926\u0928"+
		"\u0005\u0014\u0000\u0000\u0927\u0926\u0001\u0000\u0000\u0000\u0927\u0928"+
		"\u0001\u0000\u0000\u0000\u0928\u0929\u0001\u0000\u0000\u0000\u0929\u092a"+
		"\u0003\u0144\u00a2\u0000\u092a\u00ab\u0001\u0000\u0000\u0000\u092b\u092c"+
		"\u0005\u008a\u0000\u0000\u092c\u092e\u0005\u0128\u0000\u0000\u092d\u092f"+
		"\u0005\u00b8\u0000\u0000\u092e\u092d\u0001\u0000\u0000\u0000\u092e\u092f"+
		"\u0001\u0000\u0000\u0000\u092f\u0930\u0001\u0000\u0000\u0000\u0930\u0931"+
		"\u0003\u013e\u009f\u0000\u0931\u093a\u0005\u0002\u0000\u0000\u0932\u0937"+
		"\u0003\u00ecv\u0000\u0933\u0934\u0005\u0004\u0000\u0000\u0934\u0936\u0003"+
		"\u00ecv\u0000\u0935\u0933\u0001\u0000\u0000\u0000\u0936\u0939\u0001\u0000"+
		"\u0000\u0000\u0937\u0935\u0001\u0000\u0000\u0000\u0937\u0938\u0001\u0000"+
		"\u0000\u0000\u0938\u093b\u0001\u0000\u0000\u0000\u0939\u0937\u0001\u0000"+
		"\u0000\u0000\u093a\u0932\u0001\u0000\u0000\u0000\u093a\u093b\u0001\u0000"+
		"\u0000\u0000\u093b\u093c\u0001\u0000\u0000\u0000\u093c\u093d\u0005\u0003"+
		"\u0000\u0000\u093d\u0949\u0003\u0144\u00a2\u0000\u093e\u0940\u0005\u0014"+
		"\u0000\u0000\u093f\u093e\u0001\u0000\u0000\u0000\u093f\u0940\u0001\u0000"+
		"\u0000\u0000\u0940\u0941\u0001\u0000\u0000\u0000\u0941\u0946\u0003\u0144"+
		"\u00a2\u0000\u0942\u0943\u0005\u0004\u0000\u0000\u0943\u0945\u0003\u0144"+
		"\u00a2\u0000\u0944\u0942\u0001\u0000\u0000\u0000\u0945\u0948\u0001\u0000"+
		"\u0000\u0000\u0946\u0944\u0001\u0000\u0000\u0000\u0946\u0947\u0001\u0000"+
		"\u0000\u0000\u0947\u094a\u0001\u0000\u0000\u0000\u0948\u0946\u0001\u0000"+
		"\u0000\u0000\u0949\u093f\u0001\u0000\u0000\u0000\u0949\u094a\u0001\u0000"+
		"\u0000\u0000\u094a\u00ad\u0001\u0000\u0000\u0000\u094b\u094c\u0007\u0015"+
		"\u0000\u0000\u094c\u00af\u0001\u0000\u0000\u0000\u094d\u094f\u0005\u008a"+
		"\u0000\u0000\u094e\u094d\u0001\u0000\u0000\u0000\u094e\u094f\u0001\u0000"+
		"\u0000\u0000\u094f\u0950\u0001\u0000\u0000\u0000\u0950\u0954\u0003\u00ca"+
		"e\u0000\u0951\u0953\u0003\u00b2Y\u0000\u0952\u0951\u0001\u0000\u0000\u0000"+
		"\u0953\u0956\u0001\u0000\u0000\u0000\u0954\u0952\u0001\u0000\u0000\u0000"+
		"\u0954\u0955\u0001\u0000\u0000\u0000\u0955\u00b1\u0001\u0000\u0000\u0000"+
		"\u0956\u0954\u0001\u0000\u0000\u0000\u0957\u095b\u0003\u00b4Z\u0000\u0958"+
		"\u095b\u0003\u0090H\u0000\u0959\u095b\u0003\u0096K\u0000\u095a\u0957\u0001"+
		"\u0000\u0000\u0000\u095a\u0958\u0001\u0000\u0000\u0000\u095a\u0959\u0001"+
		"\u0000\u0000\u0000\u095b\u00b3\u0001\u0000\u0000\u0000\u095c\u095d\u0003"+
		"\u00b6[\u0000\u095d\u095f\u0005\u0087\u0000\u0000\u095e\u0960\u0005\u008a"+
		"\u0000\u0000\u095f\u095e\u0001\u0000\u0000\u0000\u095f\u0960\u0001\u0000"+
		"\u0000\u0000\u0960\u0961\u0001\u0000\u0000\u0000\u0961\u0963\u0003\u00ca"+
		"e\u0000\u0962\u0964\u0003\u00b8\\\u0000\u0963\u0962\u0001\u0000\u0000"+
		"\u0000\u0963\u0964\u0001\u0000\u0000\u0000\u0964\u096e\u0001\u0000\u0000"+
		"\u0000\u0965\u0966\u0005\u00aa\u0000\u0000\u0966\u0967\u0003\u00b6[\u0000"+
		"\u0967\u0969\u0005\u0087\u0000\u0000\u0968\u096a\u0005\u008a\u0000\u0000"+
		"\u0969\u0968\u0001\u0000\u0000\u0000\u0969\u096a\u0001\u0000\u0000\u0000"+
		"\u096a\u096b\u0001\u0000\u0000\u0000\u096b\u096c\u0003\u00cae\u0000\u096c"+
		"\u096e\u0001\u0000\u0000\u0000\u096d\u095c\u0001\u0000\u0000\u0000\u096d"+
		"\u0965\u0001\u0000\u0000\u0000\u096e\u00b5\u0001\u0000\u0000\u0000\u096f"+
		"\u0971\u0005~\u0000\u0000\u0970\u096f\u0001\u0000\u0000\u0000\u0970\u0971"+
		"\u0001\u0000\u0000\u0000\u0971\u0988\u0001\u0000\u0000\u0000\u0972\u0988"+
		"\u00056\u0000\u0000\u0973\u0975\u0005\u008d\u0000\u0000\u0974\u0976\u0005"+
		"\u00b8\u0000\u0000\u0975\u0974\u0001\u0000\u0000\u0000\u0975\u0976\u0001"+
		"\u0000\u0000\u0000\u0976\u0988\u0001\u0000\u0000\u0000\u0977\u0979\u0005"+
		"\u008d\u0000\u0000\u0978\u0977\u0001\u0000\u0000\u0000\u0978\u0979\u0001"+
		"\u0000\u0000\u0000\u0979\u097a\u0001\u0000\u0000\u0000\u097a\u0988\u0005"+
		"\u00ea\u0000\u0000\u097b\u097d\u0005\u00dd\u0000\u0000\u097c\u097e\u0005"+
		"\u00b8\u0000\u0000\u097d\u097c\u0001\u0000\u0000\u0000\u097d\u097e\u0001"+
		"\u0000\u0000\u0000\u097e\u0988\u0001\u0000\u0000\u0000\u097f\u0981\u0005"+
		"l\u0000\u0000\u0980\u0982\u0005\u00b8\u0000\u0000\u0981\u0980\u0001\u0000"+
		"\u0000\u0000\u0981\u0982\u0001\u0000\u0000\u0000\u0982\u0988\u0001\u0000"+
		"\u0000\u0000\u0983\u0985\u0005\u008d\u0000\u0000\u0984\u0983\u0001\u0000"+
		"\u0000\u0000\u0984\u0985\u0001\u0000\u0000\u0000\u0985\u0986\u0001\u0000"+
		"\u0000\u0000\u0986\u0988\u0005\u000f\u0000\u0000\u0987\u0970\u0001\u0000"+
		"\u0000\u0000\u0987\u0972\u0001\u0000\u0000\u0000\u0987\u0973\u0001\u0000"+
		"\u0000\u0000\u0987\u0978\u0001\u0000\u0000\u0000\u0987\u097b\u0001\u0000"+
		"\u0000\u0000\u0987\u097f\u0001\u0000\u0000\u0000\u0987\u0984\u0001\u0000"+
		"\u0000\u0000\u0988\u00b7\u0001\u0000\u0000\u0000\u0989\u098a\u0005\u00b1"+
		"\u0000\u0000\u098a\u098e\u0003\u00f0x\u0000\u098b\u098c\u0005\u0125\u0000"+
		"\u0000\u098c\u098e\u0003\u00be_\u0000\u098d\u0989\u0001\u0000\u0000\u0000"+
		"\u098d\u098b\u0001\u0000\u0000\u0000\u098e\u00b9\u0001\u0000\u0000\u0000"+
		"\u098f\u0990\u0005\u0104\u0000\u0000\u0990\u0992\u0005\u0002\u0000\u0000"+
		"\u0991\u0993\u0003\u00bc^\u0000\u0992\u0991\u0001\u0000\u0000\u0000\u0992"+
		"\u0993\u0001\u0000\u0000\u0000\u0993\u0994\u0001\u0000\u0000\u0000\u0994"+
		"\u0999\u0005\u0003\u0000\u0000\u0995\u0996\u0005\u00d7\u0000\u0000\u0996"+
		"\u0997\u0005\u0002\u0000\u0000\u0997\u0998\u0005\u014f\u0000\u0000\u0998"+
		"\u099a\u0005\u0003\u0000\u0000\u0999\u0995\u0001\u0000\u0000\u0000\u0999"+
		"\u099a\u0001\u0000\u0000\u0000\u099a\u00bb\u0001\u0000\u0000\u0000\u099b"+
		"\u099d\u0005\u013d\u0000\u0000\u099c\u099b\u0001\u0000\u0000\u0000\u099c"+
		"\u099d\u0001\u0000\u0000\u0000\u099d\u099e\u0001\u0000\u0000\u0000\u099e"+
		"\u099f\u0007\u0016\u0000\u0000\u099f\u09b4\u0005\u00c3\u0000\u0000\u09a0"+
		"\u09a1\u0003\u00ecv\u0000\u09a1\u09a2\u0005\u00e4\u0000\u0000\u09a2\u09b4"+
		"\u0001\u0000\u0000\u0000\u09a3\u09a4\u0005\u001a\u0000\u0000\u09a4\u09a5"+
		"\u0005\u014f\u0000\u0000\u09a5\u09a6\u0005\u00b7\u0000\u0000\u09a6\u09a7"+
		"\u0005\u00af\u0000\u0000\u09a7\u09b0\u0005\u014f\u0000\u0000\u09a8\u09ae"+
		"\u0005\u00b1\u0000\u0000\u09a9\u09af\u0003\u0144\u00a2\u0000\u09aa\u09ab"+
		"\u0003\u013e\u009f\u0000\u09ab\u09ac\u0005\u0002\u0000\u0000\u09ac\u09ad"+
		"\u0005\u0003\u0000\u0000\u09ad\u09af\u0001\u0000\u0000\u0000\u09ae\u09a9"+
		"\u0001\u0000\u0000\u0000\u09ae\u09aa\u0001\u0000\u0000\u0000\u09af\u09b1"+
		"\u0001\u0000\u0000\u0000\u09b0\u09a8\u0001\u0000\u0000\u0000\u09b0\u09b1"+
		"\u0001\u0000\u0000\u0000\u09b1\u09b4\u0001\u0000\u0000\u0000\u09b2\u09b4"+
		"\u0003\u00ecv\u0000\u09b3\u099c\u0001\u0000\u0000\u0000\u09b3\u09a0\u0001"+
		"\u0000\u0000\u0000\u09b3\u09a3\u0001\u0000\u0000\u0000\u09b3\u09b2\u0001"+
		"\u0000\u0000\u0000\u09b4\u00bd\u0001\u0000\u0000\u0000\u09b5\u09b6\u0005"+
		"\u0002\u0000\u0000\u09b6\u09b7\u0003\u00c0`\u0000\u09b7\u09b8\u0005\u0003"+
		"\u0000\u0000\u09b8\u00bf\u0001\u0000\u0000\u0000\u09b9\u09be\u0003\u0140"+
		"\u00a0\u0000\u09ba\u09bb\u0005\u0004\u0000\u0000\u09bb\u09bd\u0003\u0140"+
		"\u00a0\u0000\u09bc\u09ba\u0001\u0000\u0000\u0000\u09bd\u09c0\u0001\u0000"+
		"\u0000\u0000\u09be\u09bc\u0001\u0000\u0000\u0000\u09be\u09bf\u0001\u0000"+
		"\u0000\u0000\u09bf\u00c1\u0001\u0000\u0000\u0000\u09c0\u09be\u0001\u0000"+
		"\u0000\u0000\u09c1\u09c2\u0005\u0002\u0000\u0000\u09c2\u09c7\u0003\u00c4"+
		"b\u0000\u09c3\u09c4\u0005\u0004\u0000\u0000\u09c4\u09c6\u0003\u00c4b\u0000"+
		"\u09c5\u09c3\u0001\u0000\u0000\u0000\u09c6\u09c9\u0001\u0000\u0000\u0000"+
		"\u09c7\u09c5\u0001\u0000\u0000\u0000\u09c7\u09c8\u0001\u0000\u0000\u0000"+
		"\u09c8\u09ca\u0001\u0000\u0000\u0000\u09c9\u09c7\u0001\u0000\u0000\u0000"+
		"\u09ca\u09cb\u0005\u0003\u0000\u0000\u09cb\u00c3\u0001\u0000\u0000\u0000"+
		"\u09cc\u09ce\u0003\u0140\u00a0\u0000\u09cd\u09cf\u0007\u000f\u0000\u0000"+
		"\u09ce\u09cd\u0001\u0000\u0000\u0000\u09ce\u09cf\u0001\u0000\u0000\u0000"+
		"\u09cf\u00c5\u0001\u0000\u0000\u0000\u09d0\u09d1\u0005\u0002\u0000\u0000"+
		"\u09d1\u09d6\u0003\u00c8d\u0000\u09d2\u09d3\u0005\u0004\u0000\u0000\u09d3"+
		"\u09d5\u0003\u00c8d\u0000\u09d4\u09d2\u0001\u0000\u0000\u0000\u09d5\u09d8"+
		"\u0001\u0000\u0000\u0000\u09d6\u09d4\u0001\u0000\u0000\u0000\u09d6\u09d7"+
		"\u0001\u0000\u0000\u0000\u09d7\u09d9\u0001\u0000\u0000\u0000\u09d8\u09d6"+
		"\u0001\u0000\u0000\u0000\u09d9\u09da\u0005\u0003\u0000\u0000\u09da\u00c7"+
		"\u0001\u0000\u0000\u0000\u09db\u09dd\u0003\u0144\u00a2\u0000\u09dc\u09de"+
		"\u0003\"\u0011\u0000\u09dd\u09dc\u0001\u0000\u0000\u0000\u09dd\u09de\u0001"+
		"\u0000\u0000\u0000\u09de\u00c9\u0001\u0000\u0000\u0000\u09df\u09e1\u0003"+
		"\u00d6k\u0000\u09e0\u09e2\u0003\u0084B\u0000\u09e1\u09e0\u0001\u0000\u0000"+
		"\u0000\u09e1\u09e2\u0001\u0000\u0000\u0000\u09e2\u09e4\u0001\u0000\u0000"+
		"\u0000\u09e3\u09e5\u0003\u00ba]\u0000\u09e4\u09e3\u0001\u0000\u0000\u0000"+
		"\u09e4\u09e5\u0001\u0000\u0000\u0000\u09e5\u09e6\u0001\u0000\u0000\u0000"+
		"\u09e6\u09e7\u0003\u00d0h\u0000\u09e7\u09fb\u0001\u0000\u0000\u0000\u09e8"+
		"\u09e9\u0005\u0002\u0000\u0000\u09e9\u09ea\u0003$\u0012\u0000\u09ea\u09ec"+
		"\u0005\u0003\u0000\u0000\u09eb\u09ed\u0003\u00ba]\u0000\u09ec\u09eb\u0001"+
		"\u0000\u0000\u0000\u09ec\u09ed\u0001\u0000\u0000\u0000\u09ed\u09ee\u0001"+
		"\u0000\u0000\u0000\u09ee\u09ef\u0003\u00d0h\u0000\u09ef\u09fb\u0001\u0000"+
		"\u0000\u0000\u09f0\u09f1\u0005\u0002\u0000\u0000\u09f1\u09f2\u0003\u00b0"+
		"X\u0000\u09f2\u09f4\u0005\u0003\u0000\u0000\u09f3\u09f5\u0003\u00ba]\u0000"+
		"\u09f4\u09f3\u0001\u0000\u0000\u0000\u09f4\u09f5\u0001\u0000\u0000\u0000"+
		"\u09f5\u09f6\u0001\u0000\u0000\u0000\u09f6\u09f7\u0003\u00d0h\u0000\u09f7"+
		"\u09fb\u0001\u0000\u0000\u0000\u09f8\u09fb\u0003\u00ccf\u0000\u09f9\u09fb"+
		"\u0003\u00ceg\u0000\u09fa\u09df\u0001\u0000\u0000\u0000\u09fa\u09e8\u0001"+
		"\u0000\u0000\u0000\u09fa\u09f0\u0001\u0000\u0000\u0000\u09fa\u09f8\u0001"+
		"\u0000\u0000\u0000\u09fa\u09f9\u0001\u0000\u0000\u0000\u09fb\u00cb\u0001"+
		"\u0000\u0000\u0000\u09fc\u09fd\u0005\u0126\u0000\u0000\u09fd\u0a02\u0003"+
		"\u00ecv\u0000\u09fe\u09ff\u0005\u0004\u0000\u0000\u09ff\u0a01\u0003\u00ec"+
		"v\u0000\u0a00\u09fe\u0001\u0000\u0000\u0000\u0a01\u0a04\u0001\u0000\u0000"+
		"\u0000\u0a02\u0a00\u0001\u0000\u0000\u0000\u0a02\u0a03\u0001\u0000\u0000"+
		"\u0000\u0a03\u0a05\u0001\u0000\u0000\u0000\u0a04\u0a02\u0001\u0000\u0000"+
		"\u0000\u0a05\u0a06\u0003\u00d0h\u0000\u0a06\u00cd\u0001\u0000\u0000\u0000"+
		"\u0a07\u0a08\u0003\u013c\u009e\u0000\u0a08\u0a11\u0005\u0002\u0000\u0000"+
		"\u0a09\u0a0e\u0003\u00ecv\u0000\u0a0a\u0a0b\u0005\u0004\u0000\u0000\u0a0b"+
		"\u0a0d\u0003\u00ecv\u0000\u0a0c\u0a0a\u0001\u0000\u0000\u0000\u0a0d\u0a10"+
		"\u0001\u0000\u0000\u0000\u0a0e\u0a0c\u0001\u0000\u0000\u0000\u0a0e\u0a0f"+
		"\u0001\u0000\u0000\u0000\u0a0f\u0a12\u0001\u0000\u0000\u0000\u0a10\u0a0e"+
		"\u0001\u0000\u0000\u0000\u0a11\u0a09\u0001\u0000\u0000\u0000\u0a11\u0a12"+
		"\u0001\u0000\u0000\u0000\u0a12\u0a13\u0001\u0000\u0000\u0000\u0a13\u0a14"+
		"\u0005\u0003\u0000\u0000\u0a14\u0a15\u0003\u00d0h\u0000\u0a15\u00cf\u0001"+
		"\u0000\u0000\u0000\u0a16\u0a18\u0005\u0014\u0000\u0000\u0a17\u0a16\u0001"+
		"\u0000\u0000\u0000\u0a17\u0a18\u0001\u0000\u0000\u0000\u0a18\u0a19\u0001"+
		"\u0000\u0000\u0000\u0a19\u0a1b\u0003\u0146\u00a3\u0000\u0a1a\u0a1c\u0003"+
		"\u00be_\u0000\u0a1b\u0a1a\u0001\u0000\u0000\u0000\u0a1b\u0a1c\u0001\u0000"+
		"\u0000\u0000\u0a1c\u0a1e\u0001\u0000\u0000\u0000\u0a1d\u0a17\u0001\u0000"+
		"\u0000\u0000\u0a1d\u0a1e\u0001\u0000\u0000\u0000\u0a1e\u00d1\u0001\u0000"+
		"\u0000\u0000\u0a1f\u0a20\u0005\u00e3\u0000\u0000\u0a20\u0a21\u0005i\u0000"+
		"\u0000\u0a21\u0a22\u0005\u00ec\u0000\u0000\u0a22\u0a26\u0003\u0150\u00a8"+
		"\u0000\u0a23\u0a24\u0005\u012f\u0000\u0000\u0a24\u0a25\u0005\u00ed\u0000"+
		"\u0000\u0a25\u0a27\u0003>\u001f\u0000\u0a26\u0a23\u0001\u0000\u0000\u0000"+
		"\u0a26\u0a27\u0001\u0000\u0000\u0000\u0a27\u0a51\u0001\u0000\u0000\u0000"+
		"\u0a28\u0a29\u0005\u00e3\u0000\u0000\u0a29\u0a2a\u0005i\u0000\u0000\u0a2a"+
		"\u0a34\u0005I\u0000\u0000\u0a2b\u0a2c\u0005b\u0000\u0000\u0a2c\u0a2d\u0005"+
		"\u0108\u0000\u0000\u0a2d\u0a2e\u0005\u001c\u0000\u0000\u0a2e\u0a32\u0003"+
		"\u0150\u00a8\u0000\u0a2f\u0a30\u0005V\u0000\u0000\u0a30\u0a31\u0005\u001c"+
		"\u0000\u0000\u0a31\u0a33\u0003\u0150\u00a8\u0000\u0a32\u0a2f\u0001\u0000"+
		"\u0000\u0000\u0a32\u0a33\u0001\u0000\u0000\u0000\u0a33\u0a35\u0001\u0000"+
		"\u0000\u0000\u0a34\u0a2b\u0001\u0000\u0000\u0000\u0a34\u0a35\u0001\u0000"+
		"\u0000\u0000\u0a35\u0a3b\u0001\u0000\u0000\u0000\u0a36\u0a37\u0005*\u0000"+
		"\u0000\u0a37\u0a38\u0005\u0086\u0000\u0000\u0a38\u0a39\u0005\u0108\u0000"+
		"\u0000\u0a39\u0a3a\u0005\u001c\u0000\u0000\u0a3a\u0a3c\u0003\u0150\u00a8"+
		"\u0000\u0a3b\u0a36\u0001\u0000\u0000\u0000\u0a3b\u0a3c\u0001\u0000\u0000"+
		"\u0000\u0a3c\u0a42\u0001\u0000\u0000\u0000\u0a3d\u0a3e\u0005\u009a\u0000"+
		"\u0000\u0a3e\u0a3f\u0005\u0088\u0000\u0000\u0a3f\u0a40\u0005\u0108\u0000"+
		"\u0000\u0a40\u0a41\u0005\u001c\u0000\u0000\u0a41\u0a43\u0003\u0150\u00a8"+
		"\u0000\u0a42\u0a3d\u0001\u0000\u0000\u0000\u0a42\u0a43\u0001\u0000\u0000"+
		"\u0000\u0a43\u0a48\u0001\u0000\u0000\u0000\u0a44\u0a45\u0005\u0091\u0000"+
		"\u0000\u0a45\u0a46\u0005\u0108\u0000\u0000\u0a46\u0a47\u0005\u001c\u0000"+
		"\u0000\u0a47\u0a49\u0003\u0150\u00a8\u0000\u0a48\u0a44\u0001\u0000\u0000"+
		"\u0000\u0a48\u0a49\u0001\u0000\u0000\u0000\u0a49\u0a4e\u0001\u0000\u0000"+
		"\u0000\u0a4a\u0a4b\u0005\u00ad\u0000\u0000\u0a4b\u0a4c\u0005G\u0000\u0000"+
		"\u0a4c\u0a4d\u0005\u0014\u0000\u0000\u0a4d\u0a4f\u0003\u0150\u00a8\u0000"+
		"\u0a4e\u0a4a\u0001\u0000\u0000\u0000\u0a4e\u0a4f\u0001\u0000\u0000\u0000"+
		"\u0a4f\u0a51\u0001\u0000\u0000\u0000\u0a50\u0a1f\u0001\u0000\u0000\u0000"+
		"\u0a50\u0a28\u0001\u0000\u0000\u0000\u0a51\u00d3\u0001\u0000\u0000\u0000"+
		"\u0a52\u0a57\u0003\u00d6k\u0000\u0a53\u0a54\u0005\u0004\u0000\u0000\u0a54"+
		"\u0a56\u0003\u00d6k\u0000\u0a55\u0a53\u0001\u0000\u0000\u0000\u0a56\u0a59"+
		"\u0001\u0000\u0000\u0000\u0a57\u0a55\u0001\u0000\u0000\u0000\u0a57\u0a58"+
		"\u0001\u0000\u0000\u0000\u0a58\u00d5\u0001\u0000\u0000\u0000\u0a59\u0a57"+
		"\u0001\u0000\u0000\u0000\u0a5a\u0a5f\u0003\u0140\u00a0\u0000\u0a5b\u0a5c"+
		"\u0005\u0005\u0000\u0000\u0a5c\u0a5e\u0003\u0140\u00a0\u0000\u0a5d\u0a5b"+
		"\u0001\u0000\u0000\u0000\u0a5e\u0a61\u0001\u0000\u0000\u0000\u0a5f\u0a5d"+
		"\u0001\u0000\u0000\u0000\u0a5f\u0a60\u0001\u0000\u0000\u0000\u0a60\u00d7"+
		"\u0001\u0000\u0000\u0000\u0a61\u0a5f\u0001\u0000\u0000\u0000\u0a62\u0a67"+
		"\u0003\u00dam\u0000\u0a63\u0a64\u0005\u0004\u0000\u0000\u0a64\u0a66\u0003"+
		"\u00dam\u0000\u0a65\u0a63\u0001\u0000\u0000\u0000\u0a66\u0a69\u0001\u0000"+
		"\u0000\u0000\u0a67\u0a65\u0001\u0000\u0000\u0000\u0a67\u0a68\u0001\u0000"+
		"\u0000\u0000\u0a68\u00d9\u0001\u0000\u0000\u0000\u0a69\u0a67\u0001\u0000"+
		"\u0000\u0000\u0a6a\u0a6d\u0003\u00d6k\u0000\u0a6b\u0a6c\u0005\u00b4\u0000"+
		"\u0000\u0a6c\u0a6e\u0003>\u001f\u0000\u0a6d\u0a6b\u0001\u0000\u0000\u0000"+
		"\u0a6d\u0a6e\u0001\u0000\u0000\u0000\u0a6e\u00db\u0001\u0000\u0000\u0000"+
		"\u0a6f\u0a70\u0003\u0140\u00a0\u0000\u0a70\u0a71\u0005\u0005\u0000\u0000"+
		"\u0a71\u0a73\u0001\u0000\u0000\u0000\u0a72\u0a6f\u0001\u0000\u0000\u0000"+
		"\u0a72\u0a73\u0001\u0000\u0000\u0000\u0a73\u0a74\u0001\u0000\u0000\u0000"+
		"\u0a74\u0a75\u0003\u0140\u00a0\u0000\u0a75\u00dd\u0001\u0000\u0000\u0000"+
		"\u0a76\u0a77\u0003\u0140\u00a0\u0000\u0a77\u0a78\u0005\u0005\u0000\u0000"+
		"\u0a78\u0a7a\u0001\u0000\u0000\u0000\u0a79\u0a76\u0001\u0000\u0000\u0000"+
		"\u0a79\u0a7a\u0001\u0000\u0000\u0000\u0a7a\u0a7b\u0001\u0000\u0000\u0000"+
		"\u0a7b\u0a7c\u0003\u0140\u00a0\u0000\u0a7c\u00df\u0001\u0000\u0000\u0000"+
		"\u0a7d\u0a85\u0003\u00ecv\u0000\u0a7e\u0a80\u0005\u0014\u0000\u0000\u0a7f"+
		"\u0a7e\u0001\u0000\u0000\u0000\u0a7f\u0a80\u0001\u0000\u0000\u0000\u0a80"+
		"\u0a83\u0001\u0000\u0000\u0000\u0a81\u0a84\u0003\u0140\u00a0\u0000\u0a82"+
		"\u0a84\u0003\u00be_\u0000\u0a83\u0a81\u0001\u0000\u0000\u0000\u0a83\u0a82"+
		"\u0001\u0000\u0000\u0000\u0a84\u0a86\u0001\u0000\u0000\u0000\u0a85\u0a7f"+
		"\u0001\u0000\u0000\u0000\u0a85\u0a86\u0001\u0000\u0000\u0000\u0a86\u00e1"+
		"\u0001\u0000\u0000\u0000\u0a87\u0a8c\u0003\u00e0p\u0000\u0a88\u0a89\u0005"+
		"\u0004\u0000\u0000\u0a89\u0a8b\u0003\u00e0p\u0000\u0a8a\u0a88\u0001\u0000"+
		"\u0000\u0000\u0a8b\u0a8e\u0001\u0000\u0000\u0000\u0a8c\u0a8a\u0001\u0000"+
		"\u0000\u0000\u0a8c\u0a8d\u0001\u0000\u0000\u0000\u0a8d\u00e3\u0001\u0000"+
		"\u0000\u0000\u0a8e\u0a8c\u0001\u0000\u0000\u0000\u0a8f\u0a90\u0005\u0002"+
		"\u0000\u0000\u0a90\u0a95\u0003\u00e6s\u0000\u0a91\u0a92\u0005\u0004\u0000"+
		"\u0000\u0a92\u0a94\u0003\u00e6s\u0000\u0a93\u0a91\u0001\u0000\u0000\u0000"+
		"\u0a94\u0a97\u0001\u0000\u0000\u0000\u0a95\u0a93\u0001\u0000\u0000\u0000"+
		"\u0a95\u0a96\u0001\u0000\u0000\u0000\u0a96\u0a98\u0001\u0000\u0000\u0000"+
		"\u0a97\u0a95\u0001\u0000\u0000\u0000\u0a98\u0a99\u0005\u0003\u0000\u0000"+
		"\u0a99\u00e5\u0001\u0000\u0000\u0000\u0a9a\u0a9d\u0003\u00e8t\u0000\u0a9b"+
		"\u0a9d\u0003\u0120\u0090\u0000\u0a9c\u0a9a\u0001\u0000\u0000\u0000\u0a9c"+
		"\u0a9b\u0001\u0000\u0000\u0000\u0a9d\u00e7\u0001\u0000\u0000\u0000\u0a9e"+
		"\u0aac\u0003\u013e\u009f\u0000\u0a9f\u0aa0\u0003\u0144\u00a2\u0000\u0aa0"+
		"\u0aa1\u0005\u0002\u0000\u0000\u0aa1\u0aa6\u0003\u00eau\u0000\u0aa2\u0aa3"+
		"\u0005\u0004\u0000\u0000\u0aa3\u0aa5\u0003\u00eau\u0000\u0aa4\u0aa2\u0001"+
		"\u0000\u0000\u0000\u0aa5\u0aa8\u0001\u0000\u0000\u0000\u0aa6\u0aa4\u0001"+
		"\u0000\u0000\u0000\u0aa6\u0aa7\u0001\u0000\u0000\u0000\u0aa7\u0aa9\u0001"+
		"\u0000\u0000\u0000\u0aa8\u0aa6\u0001\u0000\u0000\u0000\u0aa9\u0aaa\u0005"+
		"\u0003\u0000\u0000\u0aaa\u0aac\u0001\u0000\u0000\u0000\u0aab\u0a9e\u0001"+
		"\u0000\u0000\u0000\u0aab\u0a9f\u0001\u0000\u0000\u0000\u0aac\u00e9\u0001"+
		"\u0000\u0000\u0000\u0aad\u0ab0\u0003\u013e\u009f\u0000\u0aae\u0ab0\u0003"+
		"\u00fa}\u0000\u0aaf\u0aad\u0001\u0000\u0000\u0000\u0aaf\u0aae\u0001\u0000"+
		"\u0000\u0000\u0ab0\u00eb\u0001\u0000\u0000\u0000\u0ab1\u0ab2\u0003\u00f0"+
		"x\u0000\u0ab2\u00ed\u0001\u0000\u0000\u0000\u0ab3\u0ab8\u0003\u00ecv\u0000"+
		"\u0ab4\u0ab5\u0005\u0004\u0000\u0000\u0ab5\u0ab7\u0003\u00ecv\u0000\u0ab6"+
		"\u0ab4\u0001\u0000\u0000\u0000\u0ab7\u0aba\u0001\u0000\u0000\u0000\u0ab8"+
		"\u0ab6\u0001\u0000\u0000\u0000\u0ab8\u0ab9\u0001\u0000\u0000\u0000\u0ab9"+
		"\u00ef\u0001\u0000\u0000\u0000\u0aba\u0ab8\u0001\u0000\u0000\u0000\u0abb"+
		"\u0abc\u0006x\uffff\uffff\u0000\u0abc\u0abd\u0005\u00ac\u0000\u0000\u0abd"+
		"\u0ac8\u0003\u00f0x\u0005\u0abe\u0abf\u0005Z\u0000\u0000\u0abf\u0ac0\u0005"+
		"\u0002\u0000\u0000\u0ac0\u0ac1\u0003$\u0012\u0000\u0ac1\u0ac2\u0005\u0003"+
		"\u0000\u0000\u0ac2\u0ac8\u0001\u0000\u0000\u0000\u0ac3\u0ac5\u0003\u00f4"+
		"z\u0000\u0ac4\u0ac6\u0003\u00f2y\u0000\u0ac5\u0ac4\u0001\u0000\u0000\u0000"+
		"\u0ac5\u0ac6\u0001\u0000\u0000\u0000\u0ac6\u0ac8\u0001\u0000\u0000\u0000"+
		"\u0ac7\u0abb\u0001\u0000\u0000\u0000\u0ac7\u0abe\u0001\u0000\u0000\u0000"+
		"\u0ac7\u0ac3\u0001\u0000\u0000\u0000\u0ac8\u0ad1\u0001\u0000\u0000\u0000"+
		"\u0ac9\u0aca\n\u0002\u0000\u0000\u0aca\u0acb\u0005\u000e\u0000\u0000\u0acb"+
		"\u0ad0\u0003\u00f0x\u0003\u0acc\u0acd\n\u0001\u0000\u0000\u0acd\u0ace"+
		"\u0005\u00b5\u0000\u0000\u0ace\u0ad0\u0003\u00f0x\u0002\u0acf\u0ac9\u0001"+
		"\u0000\u0000\u0000\u0acf\u0acc\u0001\u0000\u0000\u0000\u0ad0\u0ad3\u0001"+
		"\u0000\u0000\u0000\u0ad1\u0acf\u0001\u0000\u0000\u0000\u0ad1\u0ad2\u0001"+
		"\u0000\u0000\u0000\u0ad2\u00f1\u0001\u0000\u0000\u0000\u0ad3\u0ad1\u0001"+
		"\u0000\u0000\u0000\u0ad4\u0ad6\u0005\u00ac\u0000\u0000\u0ad5\u0ad4\u0001"+
		"\u0000\u0000\u0000\u0ad5\u0ad6\u0001\u0000\u0000\u0000\u0ad6\u0ad7\u0001"+
		"\u0000\u0000\u0000\u0ad7\u0ad8\u0005\u0018\u0000\u0000\u0ad8\u0ad9\u0003"+
		"\u00f4z\u0000\u0ad9\u0ada\u0005\u000e\u0000\u0000\u0ada\u0adb\u0003\u00f4"+
		"z\u0000\u0adb\u0b27\u0001\u0000\u0000\u0000\u0adc\u0ade\u0005\u00ac\u0000"+
		"\u0000\u0add\u0adc\u0001\u0000\u0000\u0000\u0add\u0ade\u0001\u0000\u0000"+
		"\u0000\u0ade\u0adf\u0001\u0000\u0000\u0000\u0adf\u0ae0\u0005z\u0000\u0000"+
		"\u0ae0\u0ae1\u0005\u0002\u0000\u0000\u0ae1\u0ae6\u0003\u00ecv\u0000\u0ae2"+
		"\u0ae3\u0005\u0004\u0000\u0000\u0ae3\u0ae5\u0003\u00ecv\u0000\u0ae4\u0ae2"+
		"\u0001\u0000\u0000\u0000\u0ae5\u0ae8\u0001\u0000\u0000\u0000\u0ae6\u0ae4"+
		"\u0001\u0000\u0000\u0000\u0ae6\u0ae7\u0001\u0000\u0000\u0000\u0ae7\u0ae9"+
		"\u0001\u0000\u0000\u0000\u0ae8\u0ae6\u0001\u0000\u0000\u0000\u0ae9\u0aea"+
		"\u0005\u0003\u0000\u0000\u0aea\u0b27\u0001\u0000\u0000\u0000\u0aeb\u0aed"+
		"\u0005\u00ac\u0000\u0000\u0aec\u0aeb\u0001\u0000\u0000\u0000\u0aec\u0aed"+
		"\u0001\u0000\u0000\u0000\u0aed\u0aee\u0001\u0000\u0000\u0000\u0aee\u0aef"+
		"\u0005z\u0000\u0000\u0aef\u0af0\u0005\u0002\u0000\u0000\u0af0\u0af1\u0003"+
		"$\u0012\u0000\u0af1\u0af2\u0005\u0003\u0000\u0000\u0af2\u0b27\u0001\u0000"+
		"\u0000\u0000\u0af3\u0af5\u0005\u00ac\u0000\u0000\u0af4\u0af3\u0001\u0000"+
		"\u0000\u0000\u0af4\u0af5\u0001\u0000\u0000\u0000\u0af5\u0af6\u0001\u0000"+
		"\u0000\u0000\u0af6\u0af7\u0005\u00de\u0000\u0000\u0af7\u0b27\u0003\u00f4"+
		"z\u0000\u0af8\u0afa\u0005\u00ac\u0000\u0000\u0af9\u0af8\u0001\u0000\u0000"+
		"\u0000\u0af9\u0afa\u0001\u0000\u0000\u0000\u0afa\u0afb\u0001\u0000\u0000"+
		"\u0000\u0afb\u0afc\u0007\u0017\u0000\u0000\u0afc\u0b0a\u0007\u0018\u0000"+
		"\u0000\u0afd\u0afe\u0005\u0002\u0000\u0000\u0afe\u0b0b\u0005\u0003\u0000"+
		"\u0000\u0aff\u0b00\u0005\u0002\u0000\u0000\u0b00\u0b05\u0003\u00ecv\u0000"+
		"\u0b01\u0b02\u0005\u0004\u0000\u0000\u0b02\u0b04\u0003\u00ecv\u0000\u0b03"+
		"\u0b01\u0001\u0000\u0000\u0000\u0b04\u0b07\u0001\u0000\u0000\u0000\u0b05"+
		"\u0b03\u0001\u0000\u0000\u0000\u0b05\u0b06\u0001\u0000\u0000\u0000\u0b06"+
		"\u0b08\u0001\u0000\u0000\u0000\u0b07\u0b05\u0001\u0000\u0000\u0000\u0b08"+
		"\u0b09\u0005\u0003\u0000\u0000\u0b09\u0b0b\u0001\u0000\u0000\u0000\u0b0a"+
		"\u0afd\u0001\u0000\u0000\u0000\u0b0a\u0aff\u0001\u0000\u0000\u0000\u0b0b"+
		"\u0b27\u0001\u0000\u0000\u0000\u0b0c\u0b0e\u0005\u00ac\u0000\u0000\u0b0d"+
		"\u0b0c\u0001\u0000\u0000\u0000\u0b0d\u0b0e\u0001\u0000\u0000\u0000\u0b0e"+
		"\u0b0f\u0001\u0000\u0000\u0000\u0b0f\u0b10\u0007\u0017\u0000\u0000\u0b10"+
		"\u0b13\u0003\u00f4z\u0000\u0b11\u0b12\u0005U\u0000\u0000\u0b12\u0b14\u0003"+
		"\u0150\u00a8\u0000\u0b13\u0b11\u0001\u0000\u0000\u0000\u0b13\u0b14\u0001"+
		"\u0000\u0000\u0000\u0b14\u0b27\u0001\u0000\u0000\u0000\u0b15\u0b17\u0005"+
		"\u0085\u0000\u0000\u0b16\u0b18\u0005\u00ac\u0000\u0000\u0b17\u0b16\u0001"+
		"\u0000\u0000\u0000\u0b17\u0b18\u0001\u0000\u0000\u0000\u0b18\u0b19\u0001"+
		"\u0000\u0000\u0000\u0b19\u0b27\u0005\u00ad\u0000\u0000\u0b1a\u0b1c\u0005"+
		"\u0085\u0000\u0000\u0b1b\u0b1d\u0005\u00ac\u0000\u0000\u0b1c\u0b1b\u0001"+
		"\u0000\u0000\u0000\u0b1c\u0b1d\u0001\u0000\u0000\u0000\u0b1d\u0b1e\u0001"+
		"\u0000\u0000\u0000\u0b1e\u0b27\u0007\u0019\u0000\u0000\u0b1f\u0b21\u0005"+
		"\u0085\u0000\u0000\u0b20\u0b22\u0005\u00ac\u0000\u0000\u0b21\u0b20\u0001"+
		"\u0000\u0000\u0000\u0b21\u0b22\u0001\u0000\u0000\u0000\u0b22\u0b23\u0001"+
		"\u0000\u0000\u0000\u0b23\u0b24\u0005O\u0000\u0000\u0b24\u0b25\u0005k\u0000"+
		"\u0000\u0b25\u0b27\u0003\u00f4z\u0000\u0b26\u0ad5\u0001\u0000\u0000\u0000"+
		"\u0b26\u0add\u0001\u0000\u0000\u0000\u0b26\u0aec\u0001\u0000\u0000\u0000"+
		"\u0b26\u0af4\u0001\u0000\u0000\u0000\u0b26\u0af9\u0001\u0000\u0000\u0000"+
		"\u0b26\u0b0d\u0001\u0000\u0000\u0000\u0b26\u0b15\u0001\u0000\u0000\u0000"+
		"\u0b26\u0b1a\u0001\u0000\u0000\u0000\u0b26\u0b1f\u0001\u0000\u0000\u0000"+
		"\u0b27\u00f3\u0001\u0000\u0000\u0000\u0b28\u0b29\u0006z\uffff\uffff\u0000"+
		"\u0b29\u0b2d\u0003\u00f8|\u0000\u0b2a\u0b2b\u0007\u001a\u0000\u0000\u0b2b"+
		"\u0b2d\u0003\u00f4z\u0007\u0b2c\u0b28\u0001\u0000\u0000\u0000\u0b2c\u0b2a"+
		"\u0001\u0000\u0000\u0000\u0b2d\u0b43\u0001\u0000\u0000\u0000\u0b2e\u0b2f"+
		"\n\u0006\u0000\u0000\u0b2f\u0b30\u0007\u001b\u0000\u0000\u0b30\u0b42\u0003"+
		"\u00f4z\u0007\u0b31\u0b32\n\u0005\u0000\u0000\u0b32\u0b33\u0007\u001c"+
		"\u0000\u0000\u0b33\u0b42\u0003\u00f4z\u0006\u0b34\u0b35\n\u0004\u0000"+
		"\u0000\u0b35\u0b36\u0005\u0142\u0000\u0000\u0b36\u0b42\u0003\u00f4z\u0005"+
		"\u0b37\u0b38\n\u0003\u0000\u0000\u0b38\u0b39\u0005\u0145\u0000\u0000\u0b39"+
		"\u0b42\u0003\u00f4z\u0004\u0b3a\u0b3b\n\u0002\u0000\u0000\u0b3b\u0b3c"+
		"\u0005\u0143\u0000\u0000\u0b3c\u0b42\u0003\u00f4z\u0003\u0b3d\u0b3e\n"+
		"\u0001\u0000\u0000\u0b3e\u0b3f\u0003\u00fc~\u0000\u0b3f\u0b40\u0003\u00f4"+
		"z\u0002\u0b40\u0b42\u0001\u0000\u0000\u0000\u0b41\u0b2e\u0001\u0000\u0000"+
		"\u0000\u0b41\u0b31\u0001\u0000\u0000\u0000\u0b41\u0b34\u0001\u0000\u0000"+
		"\u0000\u0b41\u0b37\u0001\u0000\u0000\u0000\u0b41\u0b3a\u0001\u0000\u0000"+
		"\u0000\u0b41\u0b3d\u0001\u0000\u0000\u0000\u0b42\u0b45\u0001\u0000\u0000"+
		"\u0000\u0b43\u0b41\u0001\u0000\u0000\u0000\u0b43\u0b44\u0001\u0000\u0000"+
		"\u0000\u0b44\u00f5\u0001\u0000\u0000\u0000\u0b45\u0b43\u0001\u0000\u0000"+
		"\u0000\u0b46\u0b47\u0007\u001d\u0000\u0000\u0b47\u00f7\u0001\u0000\u0000"+
		"\u0000\u0b48\u0b49\u0006|\uffff\uffff\u0000\u0b49\u0c37\u0007\u001e\u0000"+
		"\u0000\u0b4a\u0b4b\u0007\u001f\u0000\u0000\u0b4b\u0b4c\u0005\u0002\u0000"+
		"\u0000\u0b4c\u0b4d\u0003\u00f6{\u0000\u0b4d\u0b4e\u0005\u0004\u0000\u0000"+
		"\u0b4e\u0b4f\u0003\u00f4z\u0000\u0b4f\u0b50\u0005\u0004\u0000\u0000\u0b50"+
		"\u0b51\u0003\u00f4z\u0000\u0b51\u0b52\u0005\u0003\u0000\u0000\u0b52\u0c37"+
		"\u0001\u0000\u0000\u0000\u0b53\u0b54\u0007 \u0000\u0000\u0b54\u0b55\u0005"+
		"\u0002\u0000\u0000\u0b55\u0b56\u0003\u00f6{\u0000\u0b56\u0b57\u0005\u0004"+
		"\u0000\u0000\u0b57\u0b58\u0003\u00f4z\u0000\u0b58\u0b59\u0005\u0004\u0000"+
		"\u0000\u0b59\u0b5a\u0003\u00f4z\u0000\u0b5a\u0b5b\u0005\u0003\u0000\u0000"+
		"\u0b5b\u0c37\u0001\u0000\u0000\u0000\u0b5c\u0b5e\u0005\u001f\u0000\u0000"+
		"\u0b5d\u0b5f\u0003\u012e\u0097\u0000\u0b5e\u0b5d\u0001\u0000\u0000\u0000"+
		"\u0b5f\u0b60\u0001\u0000\u0000\u0000\u0b60\u0b5e\u0001\u0000\u0000\u0000"+
		"\u0b60\u0b61\u0001\u0000\u0000\u0000\u0b61\u0b64\u0001\u0000\u0000\u0000"+
		"\u0b62\u0b63\u0005S\u0000\u0000\u0b63\u0b65\u0003\u00ecv\u0000\u0b64\u0b62"+
		"\u0001\u0000\u0000\u0000\u0b64\u0b65\u0001\u0000\u0000\u0000\u0b65\u0b66"+
		"\u0001\u0000\u0000\u0000\u0b66\u0b67\u0005T\u0000\u0000\u0b67\u0c37\u0001"+
		"\u0000\u0000\u0000\u0b68\u0b69\u0005\u001f\u0000\u0000\u0b69\u0b6b\u0003"+
		"\u00ecv\u0000\u0b6a\u0b6c\u0003\u012e\u0097\u0000\u0b6b\u0b6a\u0001\u0000"+
		"\u0000\u0000\u0b6c\u0b6d\u0001\u0000\u0000\u0000\u0b6d\u0b6b\u0001\u0000"+
		"\u0000\u0000\u0b6d\u0b6e\u0001\u0000\u0000\u0000\u0b6e\u0b71\u0001\u0000"+
		"\u0000\u0000\u0b6f\u0b70\u0005S\u0000\u0000\u0b70\u0b72\u0003\u00ecv\u0000"+
		"\u0b71\u0b6f\u0001\u0000\u0000\u0000\u0b71\u0b72\u0001\u0000\u0000\u0000"+
		"\u0b72\u0b73\u0001\u0000\u0000\u0000\u0b73\u0b74\u0005T\u0000\u0000\u0b74"+
		"\u0c37\u0001\u0000\u0000\u0000\u0b75\u0b76\u0007!\u0000\u0000\u0b76\u0b77"+
		"\u0005\u0002\u0000\u0000\u0b77\u0b78\u0003\u00ecv\u0000\u0b78\u0b79\u0005"+
		"\u0014\u0000\u0000\u0b79\u0b7a\u0003\u0116\u008b\u0000\u0b7a\u0b7b\u0005"+
		"\u0003\u0000\u0000\u0b7b\u0c37\u0001\u0000\u0000\u0000\u0b7c\u0b7d\u0005"+
		"\u00fc\u0000\u0000\u0b7d\u0b86\u0005\u0002\u0000\u0000\u0b7e\u0b83\u0003"+
		"\u00e0p\u0000\u0b7f\u0b80\u0005\u0004\u0000\u0000\u0b80\u0b82\u0003\u00e0"+
		"p\u0000\u0b81\u0b7f\u0001\u0000\u0000\u0000\u0b82\u0b85\u0001\u0000\u0000"+
		"\u0000\u0b83\u0b81\u0001\u0000\u0000\u0000\u0b83\u0b84\u0001\u0000\u0000"+
		"\u0000\u0b84\u0b87\u0001\u0000\u0000\u0000\u0b85\u0b83\u0001\u0000\u0000"+
		"\u0000\u0b86\u0b7e\u0001\u0000\u0000\u0000\u0b86\u0b87\u0001\u0000\u0000"+
		"\u0000\u0b87\u0b88\u0001\u0000\u0000\u0000\u0b88\u0c37\u0005\u0003\u0000"+
		"\u0000\u0b89\u0b8a\u0005e\u0000\u0000\u0b8a\u0b8b\u0005\u0002\u0000\u0000"+
		"\u0b8b\u0b8e\u0003\u00ecv\u0000\u0b8c\u0b8d\u0005x\u0000\u0000\u0b8d\u0b8f"+
		"\u0005\u00ae\u0000\u0000\u0b8e\u0b8c\u0001\u0000\u0000\u0000\u0b8e\u0b8f"+
		"\u0001\u0000\u0000\u0000\u0b8f\u0b90\u0001\u0000\u0000\u0000\u0b90\u0b91"+
		"\u0005\u0003\u0000\u0000\u0b91\u0c37\u0001\u0000\u0000\u0000\u0b92\u0b93"+
		"\u0005\u0011\u0000\u0000\u0b93\u0b94\u0005\u0002\u0000\u0000\u0b94\u0b97"+
		"\u0003\u00ecv\u0000\u0b95\u0b96\u0005x\u0000\u0000\u0b96\u0b98\u0005\u00ae"+
		"\u0000\u0000\u0b97\u0b95\u0001\u0000\u0000\u0000\u0b97\u0b98\u0001\u0000"+
		"\u0000\u0000\u0b98\u0b99\u0001\u0000\u0000\u0000\u0b99\u0b9a\u0005\u0003"+
		"\u0000\u0000\u0b9a\u0c37\u0001\u0000\u0000\u0000\u0b9b\u0b9c\u0005\u0089"+
		"\u0000\u0000\u0b9c\u0b9d\u0005\u0002\u0000\u0000\u0b9d\u0ba0\u0003\u00ec"+
		"v\u0000\u0b9e\u0b9f\u0005x\u0000\u0000\u0b9f\u0ba1\u0005\u00ae\u0000\u0000"+
		"\u0ba0\u0b9e\u0001\u0000\u0000\u0000\u0ba0\u0ba1\u0001\u0000\u0000\u0000"+
		"\u0ba1\u0ba2\u0001\u0000\u0000\u0000\u0ba2\u0ba3\u0005\u0003\u0000\u0000"+
		"\u0ba3\u0c37\u0001\u0000\u0000\u0000\u0ba4\u0ba5\u0005\u00c6\u0000\u0000"+
		"\u0ba5\u0ba6\u0005\u0002\u0000\u0000\u0ba6\u0ba7\u0003\u00f4z\u0000\u0ba7"+
		"\u0ba8\u0005z\u0000\u0000\u0ba8\u0ba9\u0003\u00f4z\u0000\u0ba9\u0baa\u0005"+
		"\u0003\u0000\u0000\u0baa\u0c37\u0001\u0000\u0000\u0000\u0bab\u0c37\u0003"+
		"\u00fa}\u0000\u0bac\u0c37\u0005\u013e\u0000\u0000\u0bad\u0bae\u0003\u013e"+
		"\u009f\u0000\u0bae\u0baf\u0005\u0005\u0000\u0000\u0baf\u0bb0\u0005\u013e"+
		"\u0000\u0000\u0bb0\u0c37\u0001\u0000\u0000\u0000\u0bb1\u0bb2\u0005\u0002"+
		"\u0000\u0000\u0bb2\u0bb5\u0003\u00e0p\u0000\u0bb3\u0bb4\u0005\u0004\u0000"+
		"\u0000\u0bb4\u0bb6\u0003\u00e0p\u0000\u0bb5\u0bb3\u0001\u0000\u0000\u0000"+
		"\u0bb6\u0bb7\u0001\u0000\u0000\u0000\u0bb7\u0bb5\u0001\u0000\u0000\u0000"+
		"\u0bb7\u0bb8\u0001\u0000\u0000\u0000\u0bb8\u0bb9\u0001\u0000\u0000\u0000"+
		"\u0bb9\u0bba\u0005\u0003\u0000\u0000\u0bba\u0c37\u0001\u0000\u0000\u0000"+
		"\u0bbb\u0bbc\u0005\u0002\u0000\u0000\u0bbc\u0bbd\u0003$\u0012\u0000\u0bbd"+
		"\u0bbe\u0005\u0003\u0000\u0000\u0bbe\u0c37\u0001\u0000\u0000\u0000\u0bbf"+
		"\u0bc0\u0003\u013c\u009e\u0000\u0bc0\u0bcc\u0005\u0002\u0000\u0000\u0bc1"+
		"\u0bc3\u0003\u00aeW\u0000\u0bc2\u0bc1\u0001\u0000\u0000\u0000\u0bc2\u0bc3"+
		"\u0001\u0000\u0000\u0000\u0bc3\u0bc4\u0001\u0000\u0000\u0000\u0bc4\u0bc9"+
		"\u0003\u00ecv\u0000\u0bc5\u0bc6\u0005\u0004\u0000\u0000\u0bc6\u0bc8\u0003"+
		"\u00ecv\u0000\u0bc7\u0bc5\u0001\u0000\u0000\u0000\u0bc8\u0bcb\u0001\u0000"+
		"\u0000\u0000\u0bc9\u0bc7\u0001\u0000\u0000\u0000\u0bc9\u0bca\u0001\u0000"+
		"\u0000\u0000\u0bca\u0bcd\u0001\u0000\u0000\u0000\u0bcb\u0bc9\u0001\u0000"+
		"\u0000\u0000\u0bcc\u0bc2\u0001\u0000\u0000\u0000\u0bcc\u0bcd\u0001\u0000"+
		"\u0000\u0000\u0bcd\u0bce\u0001\u0000\u0000\u0000\u0bce\u0bd5\u0005\u0003"+
		"\u0000\u0000\u0bcf\u0bd0\u0005c\u0000\u0000\u0bd0\u0bd1\u0005\u0002\u0000"+
		"\u0000\u0bd1\u0bd2\u0005\u012d\u0000\u0000\u0bd2\u0bd3\u0003\u00f0x\u0000"+
		"\u0bd3\u0bd4\u0005\u0003\u0000\u0000\u0bd4\u0bd6\u0001\u0000\u0000\u0000"+
		"\u0bd5\u0bcf\u0001\u0000\u0000\u0000\u0bd5\u0bd6\u0001\u0000\u0000\u0000"+
		"\u0bd6\u0bd9\u0001\u0000\u0000\u0000\u0bd7\u0bd8\u0007\"\u0000\u0000\u0bd8"+
		"\u0bda\u0005\u00ae\u0000\u0000\u0bd9\u0bd7\u0001\u0000\u0000\u0000\u0bd9"+
		"\u0bda\u0001\u0000\u0000\u0000\u0bda\u0bdd\u0001\u0000\u0000\u0000\u0bdb"+
		"\u0bdc\u0005\u00ba\u0000\u0000\u0bdc\u0bde\u0003\u0134\u009a\u0000\u0bdd"+
		"\u0bdb\u0001\u0000\u0000\u0000\u0bdd\u0bde\u0001\u0000\u0000\u0000\u0bde"+
		"\u0c37\u0001\u0000\u0000\u0000\u0bdf\u0be0\u0003\u0144\u00a2\u0000\u0be0"+
		"\u0be1\u0005\u0147\u0000\u0000\u0be1\u0be2\u0003\u00ecv\u0000\u0be2\u0c37"+
		"\u0001\u0000\u0000\u0000\u0be3\u0be4\u0005\u0002\u0000\u0000\u0be4\u0be7"+
		"\u0003\u0144\u00a2\u0000\u0be5\u0be6\u0005\u0004\u0000\u0000\u0be6\u0be8"+
		"\u0003\u0144\u00a2\u0000\u0be7\u0be5\u0001\u0000\u0000\u0000\u0be8\u0be9"+
		"\u0001\u0000\u0000\u0000\u0be9\u0be7\u0001\u0000\u0000\u0000\u0be9\u0bea"+
		"\u0001\u0000\u0000\u0000\u0bea\u0beb\u0001\u0000\u0000\u0000\u0beb\u0bec"+
		"\u0005\u0003\u0000\u0000\u0bec\u0bed\u0005\u0147\u0000\u0000\u0bed\u0bee"+
		"\u0003\u00ecv\u0000\u0bee\u0c37\u0001\u0000\u0000\u0000\u0bef\u0c37\u0003"+
		"\u0144\u00a2\u0000\u0bf0\u0bf1\u0005\u0002\u0000\u0000\u0bf1\u0bf2\u0003"+
		"\u00ecv\u0000\u0bf2\u0bf3\u0005\u0003\u0000\u0000\u0bf3\u0c37\u0001\u0000"+
		"\u0000\u0000\u0bf4\u0bf5\u0005_\u0000\u0000\u0bf5\u0bf6\u0005\u0002\u0000"+
		"\u0000\u0bf6\u0bf7\u0003\u0144\u00a2\u0000\u0bf7\u0bf8\u0005k\u0000\u0000"+
		"\u0bf8\u0bf9\u0003\u00f4z\u0000\u0bf9\u0bfa\u0005\u0003\u0000\u0000\u0bfa"+
		"\u0c37\u0001\u0000\u0000\u0000\u0bfb\u0bfc\u0007#\u0000\u0000\u0bfc\u0bfd"+
		"\u0005\u0002\u0000\u0000\u0bfd\u0bfe\u0003\u00f4z\u0000\u0bfe\u0bff\u0007"+
		"$\u0000\u0000\u0bff\u0c02\u0003\u00f4z\u0000\u0c00\u0c01\u0007%\u0000"+
		"\u0000\u0c01\u0c03\u0003\u00f4z\u0000\u0c02\u0c00\u0001\u0000\u0000\u0000"+
		"\u0c02\u0c03\u0001\u0000\u0000\u0000\u0c03\u0c04\u0001\u0000\u0000\u0000"+
		"\u0c04\u0c05\u0005\u0003\u0000\u0000\u0c05\u0c37\u0001\u0000\u0000\u0000"+
		"\u0c06\u0c07\u0005\u0114\u0000\u0000\u0c07\u0c09\u0005\u0002\u0000\u0000"+
		"\u0c08\u0c0a\u0007&\u0000\u0000\u0c09\u0c08\u0001\u0000\u0000\u0000\u0c09"+
		"\u0c0a\u0001\u0000\u0000\u0000\u0c0a\u0c0c\u0001\u0000\u0000\u0000\u0c0b"+
		"\u0c0d\u0003\u00f4z\u0000\u0c0c\u0c0b\u0001\u0000\u0000\u0000\u0c0c\u0c0d"+
		"\u0001\u0000\u0000\u0000\u0c0d\u0c0e\u0001\u0000\u0000\u0000\u0c0e\u0c0f"+
		"\u0005k\u0000\u0000\u0c0f\u0c10\u0003\u00f4z\u0000\u0c10\u0c11\u0005\u0003"+
		"\u0000\u0000\u0c11\u0c37\u0001\u0000\u0000\u0000\u0c12\u0c13\u0005\u00bc"+
		"\u0000\u0000\u0c13\u0c14\u0005\u0002\u0000\u0000\u0c14\u0c15\u0003\u00f4"+
		"z\u0000\u0c15\u0c16\u0005\u00c5\u0000\u0000\u0c16\u0c17\u0003\u00f4z\u0000"+
		"\u0c17\u0c18\u0005k\u0000\u0000\u0c18\u0c1b\u0003\u00f4z\u0000\u0c19\u0c1a"+
		"\u0005g\u0000\u0000\u0c1a\u0c1c\u0003\u00f4z\u0000\u0c1b\u0c19\u0001\u0000"+
		"\u0000\u0000\u0c1b\u0c1c\u0001\u0000\u0000\u0000\u0c1c\u0c1d\u0001\u0000"+
		"\u0000\u0000\u0c1d\u0c1e\u0005\u0003\u0000\u0000\u0c1e\u0c37\u0001\u0000"+
		"\u0000\u0000\u0c1f\u0c20\u0007\'\u0000\u0000\u0c20\u0c21\u0005\u0002\u0000"+
		"\u0000\u0c21\u0c22\u0003\u00f4z\u0000\u0c22\u0c23\u0005\u0003\u0000\u0000"+
		"\u0c23\u0c24\u0005\u0130\u0000\u0000\u0c24\u0c25\u0005r\u0000\u0000\u0c25"+
		"\u0c26\u0005\u0002\u0000\u0000\u0c26\u0c27\u0005\u00b6\u0000\u0000\u0c27"+
		"\u0c28\u0005\u001c\u0000\u0000\u0c28\u0c29\u0003\\.\u0000\u0c29\u0c30"+
		"\u0005\u0003\u0000\u0000\u0c2a\u0c2b\u0005c\u0000\u0000\u0c2b\u0c2c\u0005"+
		"\u0002\u0000\u0000\u0c2c\u0c2d\u0005\u012d\u0000\u0000\u0c2d\u0c2e\u0003"+
		"\u00f0x\u0000\u0c2e\u0c2f\u0005\u0003\u0000\u0000\u0c2f\u0c31\u0001\u0000"+
		"\u0000\u0000\u0c30\u0c2a\u0001\u0000\u0000\u0000\u0c30\u0c31\u0001\u0000"+
		"\u0000\u0000\u0c31\u0c34\u0001\u0000\u0000\u0000\u0c32\u0c33\u0005\u00ba"+
		"\u0000\u0000\u0c33\u0c35\u0003\u0134\u009a\u0000\u0c34\u0c32\u0001\u0000"+
		"\u0000\u0000\u0c34\u0c35\u0001\u0000\u0000\u0000\u0c35\u0c37\u0001\u0000"+
		"\u0000\u0000\u0c36\u0b48\u0001\u0000\u0000\u0000\u0c36\u0b4a\u0001\u0000"+
		"\u0000\u0000\u0c36\u0b53\u0001\u0000\u0000\u0000\u0c36\u0b5c\u0001\u0000"+
		"\u0000\u0000\u0c36\u0b68\u0001\u0000\u0000\u0000\u0c36\u0b75\u0001\u0000"+
		"\u0000\u0000\u0c36\u0b7c\u0001\u0000\u0000\u0000\u0c36\u0b89\u0001\u0000"+
		"\u0000\u0000\u0c36\u0b92\u0001\u0000\u0000\u0000\u0c36\u0b9b\u0001\u0000"+
		"\u0000\u0000\u0c36\u0ba4\u0001\u0000\u0000\u0000\u0c36\u0bab\u0001\u0000"+
		"\u0000\u0000\u0c36\u0bac\u0001\u0000\u0000\u0000\u0c36\u0bad\u0001\u0000"+
		"\u0000\u0000\u0c36\u0bb1\u0001\u0000\u0000\u0000\u0c36\u0bbb\u0001\u0000"+
		"\u0000\u0000\u0c36\u0bbf\u0001\u0000\u0000\u0000\u0c36\u0bdf\u0001\u0000"+
		"\u0000\u0000\u0c36\u0be3\u0001\u0000\u0000\u0000\u0c36\u0bef\u0001\u0000"+
		"\u0000\u0000\u0c36\u0bf0\u0001\u0000\u0000\u0000\u0c36\u0bf4\u0001\u0000"+
		"\u0000\u0000\u0c36\u0bfb\u0001\u0000\u0000\u0000\u0c36\u0c06\u0001\u0000"+
		"\u0000\u0000\u0c36\u0c12\u0001\u0000\u0000\u0000\u0c36\u0c1f\u0001\u0000"+
		"\u0000\u0000\u0c37\u0c42\u0001\u0000\u0000\u0000\u0c38\u0c39\n\t\u0000"+
		"\u0000\u0c39\u0c3a\u0005\u0006\u0000\u0000\u0c3a\u0c3b\u0003\u00f4z\u0000"+
		"\u0c3b\u0c3c\u0005\u0007\u0000\u0000\u0c3c\u0c41\u0001\u0000\u0000\u0000"+
		"\u0c3d\u0c3e\n\u0007\u0000\u0000\u0c3e\u0c3f\u0005\u0005\u0000\u0000\u0c3f"+
		"\u0c41\u0003\u0144\u00a2\u0000\u0c40\u0c38\u0001\u0000\u0000\u0000\u0c40"+
		"\u0c3d\u0001\u0000\u0000\u0000\u0c41\u0c44\u0001\u0000\u0000\u0000\u0c42"+
		"\u0c40\u0001\u0000\u0000\u0000\u0c42\u0c43\u0001\u0000\u0000\u0000\u0c43"+
		"\u00f9\u0001\u0000\u0000\u0000\u0c44\u0c42\u0001\u0000\u0000\u0000\u0c45"+
		"\u0c54\u0005\u00ad\u0000\u0000\u0c46\u0c47\u0005\u0146\u0000\u0000\u0c47"+
		"\u0c54\u0003\u0144\u00a2\u0000\u0c48\u0c54\u0003\u0104\u0082\u0000\u0c49"+
		"\u0c4a\u0003\u0144\u00a2\u0000\u0c4a\u0c4b\u0003\u0150\u00a8\u0000\u0c4b"+
		"\u0c54\u0001\u0000\u0000\u0000\u0c4c\u0c54\u0003\u014c\u00a6\u0000\u0c4d"+
		"\u0c54\u0003\u0102\u0081\u0000\u0c4e\u0c50\u0003\u0150\u00a8\u0000\u0c4f"+
		"\u0c4e\u0001\u0000\u0000\u0000\u0c50\u0c51\u0001\u0000\u0000\u0000\u0c51"+
		"\u0c4f\u0001\u0000\u0000\u0000\u0c51\u0c52\u0001\u0000\u0000\u0000\u0c52"+
		"\u0c54\u0001\u0000\u0000\u0000\u0c53\u0c45\u0001\u0000\u0000\u0000\u0c53"+
		"\u0c46\u0001\u0000\u0000\u0000\u0c53\u0c48\u0001\u0000\u0000\u0000\u0c53"+
		"\u0c49\u0001\u0000\u0000\u0000\u0c53\u0c4c\u0001\u0000\u0000\u0000\u0c53"+
		"\u0c4d\u0001\u0000\u0000\u0000\u0c53\u0c4f\u0001\u0000\u0000\u0000\u0c54"+
		"\u00fb\u0001\u0000\u0000\u0000\u0c55\u0c56\u0007(\u0000\u0000\u0c56\u00fd"+
		"\u0001\u0000\u0000\u0000\u0c57\u0c58\u0007)\u0000\u0000\u0c58\u00ff\u0001"+
		"\u0000\u0000\u0000\u0c59\u0c5a\u0007*\u0000\u0000\u0c5a\u0101\u0001\u0000"+
		"\u0000\u0000\u0c5b\u0c5c\u0007+\u0000\u0000\u0c5c\u0103\u0001\u0000\u0000"+
		"\u0000\u0c5d\u0c60\u0005\u0083\u0000\u0000\u0c5e\u0c61\u0003\u0106\u0083"+
		"\u0000\u0c5f\u0c61\u0003\u010a\u0085\u0000\u0c60\u0c5e\u0001\u0000\u0000"+
		"\u0000\u0c60\u0c5f\u0001\u0000\u0000\u0000\u0c60\u0c61\u0001\u0000\u0000"+
		"\u0000\u0c61\u0105\u0001\u0000\u0000\u0000\u0c62\u0c64\u0003\u0108\u0084"+
		"\u0000\u0c63\u0c65\u0003\u010c\u0086\u0000\u0c64\u0c63\u0001\u0000\u0000"+
		"\u0000\u0c64\u0c65\u0001\u0000\u0000\u0000\u0c65\u0107\u0001\u0000\u0000"+
		"\u0000\u0c66\u0c67\u0003\u010e\u0087\u0000\u0c67\u0c68\u0003\u0110\u0088"+
		"\u0000\u0c68\u0c6a\u0001\u0000\u0000\u0000\u0c69\u0c66\u0001\u0000\u0000"+
		"\u0000\u0c6a\u0c6b\u0001\u0000\u0000\u0000\u0c6b\u0c69\u0001\u0000\u0000"+
		"\u0000\u0c6b\u0c6c\u0001\u0000\u0000\u0000\u0c6c\u0109\u0001\u0000\u0000"+
		"\u0000\u0c6d\u0c70\u0003\u010c\u0086\u0000\u0c6e\u0c71\u0003\u0108\u0084"+
		"\u0000\u0c6f\u0c71\u0003\u010c\u0086\u0000\u0c70\u0c6e\u0001\u0000\u0000"+
		"\u0000\u0c70\u0c6f\u0001\u0000\u0000\u0000\u0c70\u0c71\u0001\u0000\u0000"+
		"\u0000\u0c71\u010b\u0001\u0000\u0000\u0000\u0c72\u0c73\u0003\u010e\u0087"+
		"\u0000\u0c73\u0c74\u0003\u0112\u0089\u0000\u0c74\u0c75\u0005\u010e\u0000"+
		"\u0000\u0c75\u0c76\u0003\u0112\u0089\u0000\u0c76\u010d\u0001\u0000\u0000"+
		"\u0000\u0c77\u0c79\u0007,\u0000\u0000\u0c78\u0c77\u0001\u0000\u0000\u0000"+
		"\u0c78\u0c79\u0001\u0000\u0000\u0000\u0c79\u0c7d\u0001\u0000\u0000\u0000"+
		"\u0c7a\u0c7e\u0005\u014f\u0000\u0000\u0c7b\u0c7e\u0005\u0151\u0000\u0000"+
		"\u0c7c\u0c7e\u0003\u0150\u00a8\u0000\u0c7d\u0c7a\u0001\u0000\u0000\u0000"+
		"\u0c7d\u0c7b\u0001\u0000\u0000\u0000\u0c7d\u0c7c\u0001\u0000\u0000\u0000"+
		"\u0c7e\u010f\u0001\u0000\u0000\u0000\u0c7f\u0c80\u0007-\u0000\u0000\u0c80"+
		"\u0111\u0001\u0000\u0000\u0000\u0c81\u0c82\u0007.\u0000\u0000\u0c82\u0113"+
		"\u0001\u0000\u0000\u0000\u0c83\u0c87\u0005e\u0000\u0000\u0c84\u0c85\u0005"+
		"\t\u0000\u0000\u0c85\u0c87\u0003\u0140\u00a0\u0000\u0c86\u0c83\u0001\u0000"+
		"\u0000\u0000\u0c86\u0c84\u0001\u0000\u0000\u0000\u0c87\u0115\u0001\u0000"+
		"\u0000\u0000\u0c88\u0c89\u0005\u0013\u0000\u0000\u0c89\u0c8a\u0005\u0138"+
		"\u0000\u0000\u0c8a\u0c8b\u0003\u0116\u008b\u0000\u0c8b\u0c8c\u0005\u013a"+
		"\u0000\u0000\u0c8c\u0cb7\u0001\u0000\u0000\u0000\u0c8d\u0c8e\u0005\u009a"+
		"\u0000\u0000\u0c8e\u0c8f\u0005\u0138\u0000\u0000\u0c8f\u0c90\u0003\u0116"+
		"\u008b\u0000\u0c90\u0c91\u0005\u0004\u0000\u0000\u0c91\u0c92\u0003\u0116"+
		"\u008b\u0000\u0c92\u0c93\u0005\u013a\u0000\u0000\u0c93\u0cb7\u0001\u0000"+
		"\u0000\u0000\u0c94\u0c9b\u0005\u00fc\u0000\u0000\u0c95\u0c97\u0005\u0138"+
		"\u0000\u0000\u0c96\u0c98\u0003\u012a\u0095\u0000\u0c97\u0c96\u0001\u0000"+
		"\u0000\u0000\u0c97\u0c98\u0001\u0000\u0000\u0000\u0c98\u0c99\u0001\u0000"+
		"\u0000\u0000\u0c99\u0c9c\u0005\u013a\u0000\u0000\u0c9a\u0c9c\u0005\u0136"+
		"\u0000\u0000\u0c9b\u0c95\u0001\u0000\u0000\u0000\u0c9b\u0c9a\u0001\u0000"+
		"\u0000\u0000\u0c9c\u0cb7\u0001\u0000\u0000\u0000\u0c9d\u0c9e\u0005\u0083"+
		"\u0000\u0000\u0c9e\u0ca1\u0007/\u0000\u0000\u0c9f\u0ca0\u0005\u010e\u0000"+
		"\u0000\u0ca0\u0ca2\u0005\u00a3\u0000\u0000\u0ca1\u0c9f\u0001\u0000\u0000"+
		"\u0000\u0ca1\u0ca2\u0001\u0000\u0000\u0000\u0ca2\u0cb7\u0001\u0000\u0000"+
		"\u0000\u0ca3\u0ca4\u0005\u0083\u0000\u0000\u0ca4\u0ca7\u00070\u0000\u0000"+
		"\u0ca5\u0ca6\u0005\u010e\u0000\u0000\u0ca6\u0ca8\u00071\u0000\u0000\u0ca7"+
		"\u0ca5\u0001\u0000\u0000\u0000\u0ca7\u0ca8\u0001\u0000\u0000\u0000\u0ca8"+
		"\u0cb7\u0001\u0000\u0000\u0000\u0ca9\u0cb4\u0003\u0144\u00a2\u0000\u0caa"+
		"\u0cab\u0005\u0002\u0000\u0000\u0cab\u0cb0\u0005\u014f\u0000\u0000\u0cac"+
		"\u0cad\u0005\u0004\u0000\u0000\u0cad\u0caf\u0005\u014f\u0000\u0000\u0cae"+
		"\u0cac\u0001\u0000\u0000\u0000\u0caf\u0cb2\u0001\u0000\u0000\u0000\u0cb0"+
		"\u0cae\u0001\u0000\u0000\u0000\u0cb0\u0cb1\u0001\u0000\u0000\u0000\u0cb1"+
		"\u0cb3\u0001\u0000\u0000\u0000\u0cb2\u0cb0\u0001\u0000\u0000\u0000\u0cb3"+
		"\u0cb5\u0005\u0003\u0000\u0000\u0cb4\u0caa\u0001\u0000\u0000\u0000\u0cb4"+
		"\u0cb5\u0001\u0000\u0000\u0000\u0cb5\u0cb7\u0001\u0000\u0000\u0000\u0cb6"+
		"\u0c88\u0001\u0000\u0000\u0000\u0cb6\u0c8d\u0001\u0000\u0000\u0000\u0cb6"+
		"\u0c94\u0001\u0000\u0000\u0000\u0cb6\u0c9d\u0001\u0000\u0000\u0000\u0cb6"+
		"\u0ca3\u0001\u0000\u0000\u0000\u0cb6\u0ca9\u0001\u0000\u0000\u0000\u0cb7"+
		"\u0117\u0001\u0000\u0000\u0000\u0cb8\u0cbd\u0003\u011a\u008d\u0000\u0cb9"+
		"\u0cba\u0005\u0004\u0000\u0000\u0cba\u0cbc\u0003\u011a\u008d\u0000\u0cbb"+
		"\u0cb9\u0001\u0000\u0000\u0000\u0cbc\u0cbf\u0001\u0000\u0000\u0000\u0cbd"+
		"\u0cbb\u0001\u0000\u0000\u0000\u0cbd\u0cbe\u0001\u0000\u0000\u0000\u0cbe"+
		"\u0119\u0001\u0000\u0000\u0000\u0cbf\u0cbd\u0001\u0000\u0000\u0000\u0cc0"+
		"\u0cc1\u0003\u00d6k\u0000\u0cc1\u0cc4\u0003\u0116\u008b\u0000\u0cc2\u0cc3"+
		"\u0005\u00ac\u0000\u0000\u0cc3\u0cc5\u0005\u00ad\u0000\u0000\u0cc4\u0cc2"+
		"\u0001\u0000\u0000\u0000\u0cc4\u0cc5\u0001\u0000\u0000\u0000\u0cc5\u0cc7"+
		"\u0001\u0000\u0000\u0000\u0cc6\u0cc8\u0003\u011c\u008e\u0000\u0cc7\u0cc6"+
		"\u0001\u0000\u0000\u0000\u0cc7\u0cc8\u0001\u0000\u0000\u0000\u0cc8\u0cca"+
		"\u0001\u0000\u0000\u0000\u0cc9\u0ccb\u0003\"\u0011\u0000\u0cca\u0cc9\u0001"+
		"\u0000\u0000\u0000\u0cca\u0ccb\u0001\u0000\u0000\u0000\u0ccb\u0ccd\u0001"+
		"\u0000\u0000\u0000\u0ccc\u0cce\u0003\u0114\u008a\u0000\u0ccd\u0ccc\u0001"+
		"\u0000\u0000\u0000\u0ccd\u0cce\u0001\u0000\u0000\u0000\u0cce\u011b\u0001"+
		"\u0000\u0000\u0000\u0ccf\u0cd0\u0005F\u0000\u0000\u0cd0\u0cd1\u0003\u00ec"+
		"v\u0000\u0cd1\u011d\u0001\u0000\u0000\u0000\u0cd2\u0cd7\u0003\u0120\u0090"+
		"\u0000\u0cd3\u0cd4\u0005\u0004\u0000\u0000\u0cd4\u0cd6\u0003\u0120\u0090"+
		"\u0000\u0cd5\u0cd3\u0001\u0000\u0000\u0000\u0cd6\u0cd9\u0001\u0000\u0000"+
		"\u0000\u0cd7\u0cd5\u0001\u0000\u0000\u0000\u0cd7\u0cd8\u0001\u0000\u0000"+
		"\u0000\u0cd8\u011f\u0001\u0000\u0000\u0000\u0cd9\u0cd7\u0001\u0000\u0000"+
		"\u0000\u0cda\u0cdb\u0003\u0140\u00a0\u0000\u0cdb\u0cde\u0003\u0116\u008b"+
		"\u0000\u0cdc\u0cdd\u0005\u00ac\u0000\u0000\u0cdd\u0cdf\u0005\u00ad\u0000"+
		"\u0000\u0cde\u0cdc\u0001\u0000\u0000\u0000\u0cde\u0cdf\u0001\u0000\u0000"+
		"\u0000\u0cdf\u0ce1\u0001\u0000\u0000\u0000\u0ce0\u0ce2\u0003\"\u0011\u0000"+
		"\u0ce1\u0ce0\u0001\u0000\u0000\u0000\u0ce1\u0ce2\u0001\u0000\u0000\u0000"+
		"\u0ce2\u0121\u0001\u0000\u0000\u0000\u0ce3\u0ce8\u0003\u0124\u0092\u0000"+
		"\u0ce4\u0ce5\u0005\u0004\u0000\u0000\u0ce5\u0ce7\u0003\u0124\u0092\u0000"+
		"\u0ce6\u0ce4\u0001\u0000\u0000\u0000\u0ce7\u0cea\u0001\u0000\u0000\u0000"+
		"\u0ce8\u0ce6\u0001\u0000\u0000\u0000\u0ce8\u0ce9\u0001\u0000\u0000\u0000"+
		"\u0ce9\u0123\u0001\u0000\u0000\u0000\u0cea\u0ce8\u0001\u0000\u0000\u0000"+
		"\u0ceb\u0cec\u0003\u0140\u00a0\u0000\u0cec\u0cf0\u0003\u0116\u008b\u0000"+
		"\u0ced\u0cef\u0003\u0126\u0093\u0000\u0cee\u0ced\u0001\u0000\u0000\u0000"+
		"\u0cef\u0cf2\u0001\u0000\u0000\u0000\u0cf0\u0cee\u0001\u0000\u0000\u0000"+
		"\u0cf0\u0cf1\u0001\u0000\u0000\u0000\u0cf1\u0125\u0001\u0000\u0000\u0000"+
		"\u0cf2\u0cf0\u0001\u0000\u0000\u0000\u0cf3\u0cf4\u0005\u00ac\u0000\u0000"+
		"\u0cf4\u0cf9\u0005\u00ad\u0000\u0000\u0cf5\u0cf9\u0003\u011c\u008e\u0000"+
		"\u0cf6\u0cf9\u0003\u0128\u0094\u0000\u0cf7\u0cf9\u0003\"\u0011\u0000\u0cf8"+
		"\u0cf3\u0001\u0000\u0000\u0000\u0cf8\u0cf5\u0001\u0000\u0000\u0000\u0cf8"+
		"\u0cf6\u0001\u0000\u0000\u0000\u0cf8\u0cf7\u0001\u0000\u0000\u0000\u0cf9"+
		"\u0127\u0001\u0000\u0000\u0000\u0cfa\u0cfb\u0005o\u0000\u0000\u0cfb\u0cfc"+
		"\u0005\f\u0000\u0000\u0cfc\u0cfd\u0005\u0014\u0000\u0000\u0cfd\u0cfe\u0005"+
		"\u0002\u0000\u0000\u0cfe\u0cff\u0003\u00ecv\u0000\u0cff\u0d00\u0005\u0003"+
		"\u0000\u0000\u0d00\u0129\u0001\u0000\u0000\u0000\u0d01\u0d06\u0003\u012c"+
		"\u0096\u0000\u0d02\u0d03\u0005\u0004\u0000\u0000\u0d03\u0d05\u0003\u012c"+
		"\u0096\u0000\u0d04\u0d02\u0001\u0000\u0000\u0000\u0d05\u0d08\u0001\u0000"+
		"\u0000\u0000\u0d06\u0d04\u0001\u0000\u0000\u0000\u0d06\u0d07\u0001\u0000"+
		"\u0000\u0000\u0d07\u012b\u0001\u0000\u0000\u0000\u0d08\u0d06\u0001\u0000"+
		"\u0000\u0000\u0d09\u0d0b\u0003\u0144\u00a2\u0000\u0d0a\u0d0c\u0005\u0146"+
		"\u0000\u0000\u0d0b\u0d0a\u0001\u0000\u0000\u0000\u0d0b\u0d0c\u0001\u0000"+
		"\u0000\u0000\u0d0c\u0d0d\u0001\u0000\u0000\u0000\u0d0d\u0d10\u0003\u0116"+
		"\u008b\u0000\u0d0e\u0d0f\u0005\u00ac\u0000\u0000\u0d0f\u0d11\u0005\u00ad"+
		"\u0000\u0000\u0d10\u0d0e\u0001\u0000\u0000\u0000\u0d10\u0d11\u0001\u0000"+
		"\u0000\u0000\u0d11\u0d13\u0001\u0000\u0000\u0000\u0d12\u0d14\u0003\"\u0011"+
		"\u0000\u0d13\u0d12\u0001\u0000\u0000\u0000\u0d13\u0d14\u0001\u0000\u0000"+
		"\u0000\u0d14\u012d\u0001\u0000\u0000\u0000\u0d15\u0d16\u0005\u012c\u0000"+
		"\u0000\u0d16\u0d17\u0003\u00ecv\u0000\u0d17\u0d18\u0005\u0109\u0000\u0000"+
		"\u0d18\u0d19\u0003\u00ecv\u0000\u0d19\u012f\u0001\u0000\u0000\u0000\u0d1a"+
		"\u0d1b\u0005\u012e\u0000\u0000\u0d1b\u0d20\u0003\u0132\u0099\u0000\u0d1c"+
		"\u0d1d\u0005\u0004\u0000\u0000\u0d1d\u0d1f\u0003\u0132\u0099\u0000\u0d1e"+
		"\u0d1c\u0001\u0000\u0000\u0000\u0d1f\u0d22\u0001\u0000\u0000\u0000\u0d20"+
		"\u0d1e\u0001\u0000\u0000\u0000\u0d20\u0d21\u0001\u0000\u0000\u0000\u0d21"+
		"\u0131\u0001\u0000\u0000\u0000\u0d22\u0d20\u0001\u0000\u0000\u0000\u0d23"+
		"\u0d24\u0003\u0140\u00a0\u0000\u0d24\u0d25\u0005\u0014\u0000\u0000\u0d25"+
		"\u0d26\u0003\u0134\u009a\u0000\u0d26\u0133\u0001\u0000\u0000\u0000\u0d27"+
		"\u0d56\u0003\u0140\u00a0\u0000\u0d28\u0d29\u0005\u0002\u0000\u0000\u0d29"+
		"\u0d2a\u0003\u0140\u00a0\u0000\u0d2a\u0d2b\u0005\u0003\u0000\u0000\u0d2b"+
		"\u0d56\u0001\u0000\u0000\u0000\u0d2c\u0d4f\u0005\u0002\u0000\u0000\u0d2d"+
		"\u0d2e\u0005&\u0000\u0000\u0d2e\u0d2f\u0005\u001c\u0000\u0000\u0d2f\u0d34"+
		"\u0003\u00ecv\u0000\u0d30\u0d31\u0005\u0004\u0000\u0000\u0d31\u0d33\u0003"+
		"\u00ecv\u0000\u0d32\u0d30\u0001\u0000\u0000\u0000\u0d33\u0d36\u0001\u0000"+
		"\u0000\u0000\u0d34\u0d32\u0001\u0000\u0000\u0000\u0d34\u0d35\u0001\u0000"+
		"\u0000\u0000\u0d35\u0d50\u0001\u0000\u0000\u0000\u0d36\u0d34\u0001\u0000"+
		"\u0000\u0000\u0d37\u0d38\u00072\u0000\u0000\u0d38\u0d39\u0005\u001c\u0000"+
		"\u0000\u0d39\u0d3e\u0003\u00ecv\u0000\u0d3a\u0d3b\u0005\u0004\u0000\u0000"+
		"\u0d3b\u0d3d\u0003\u00ecv\u0000\u0d3c\u0d3a\u0001\u0000\u0000\u0000\u0d3d"+
		"\u0d40\u0001\u0000\u0000\u0000\u0d3e\u0d3c\u0001\u0000\u0000\u0000\u0d3e"+
		"\u0d3f\u0001\u0000\u0000\u0000\u0d3f\u0d42\u0001\u0000\u0000\u0000\u0d40"+
		"\u0d3e\u0001\u0000\u0000\u0000\u0d41\u0d37\u0001\u0000\u0000\u0000\u0d41"+
		"\u0d42\u0001\u0000\u0000\u0000\u0d42\u0d4d\u0001\u0000\u0000\u0000\u0d43"+
		"\u0d44\u00073\u0000\u0000\u0d44\u0d45\u0005\u001c\u0000\u0000\u0d45\u0d4a"+
		"\u0003\\.\u0000\u0d46\u0d47\u0005\u0004\u0000\u0000\u0d47\u0d49\u0003"+
		"\\.\u0000\u0d48\u0d46\u0001\u0000\u0000\u0000\u0d49\u0d4c\u0001\u0000"+
		"\u0000\u0000\u0d4a\u0d48\u0001\u0000\u0000\u0000\u0d4a\u0d4b\u0001\u0000"+
		"\u0000\u0000\u0d4b\u0d4e\u0001\u0000\u0000\u0000\u0d4c\u0d4a\u0001\u0000"+
		"\u0000\u0000\u0d4d\u0d43\u0001\u0000\u0000\u0000\u0d4d\u0d4e\u0001\u0000"+
		"\u0000\u0000\u0d4e\u0d50\u0001\u0000\u0000\u0000\u0d4f\u0d2d\u0001\u0000"+
		"\u0000\u0000\u0d4f\u0d41\u0001\u0000\u0000\u0000\u0d50\u0d52\u0001\u0000"+
		"\u0000\u0000\u0d51\u0d53\u0003\u0136\u009b\u0000\u0d52\u0d51\u0001\u0000"+
		"\u0000\u0000\u0d52\u0d53\u0001\u0000\u0000\u0000\u0d53\u0d54\u0001\u0000"+
		"\u0000\u0000\u0d54\u0d56\u0005\u0003\u0000\u0000\u0d55\u0d27\u0001\u0000"+
		"\u0000\u0000\u0d55\u0d28\u0001\u0000\u0000\u0000\u0d55\u0d2c\u0001\u0000"+
		"\u0000\u0000\u0d56\u0135\u0001\u0000\u0000\u0000\u0d57\u0d58\u0005\u00ce"+
		"\u0000\u0000\u0d58\u0d68\u0003\u0138\u009c\u0000\u0d59\u0d5a\u0005\u00e4"+
		"\u0000\u0000\u0d5a\u0d68\u0003\u0138\u009c\u0000\u0d5b\u0d5c\u0005\u00ce"+
		"\u0000\u0000\u0d5c\u0d5d\u0005\u0018\u0000\u0000\u0d5d\u0d5e\u0003\u0138"+
		"\u009c\u0000\u0d5e\u0d5f\u0005\u000e\u0000\u0000\u0d5f\u0d60\u0003\u0138"+
		"\u009c\u0000\u0d60\u0d68\u0001\u0000\u0000\u0000\u0d61\u0d62\u0005\u00e4"+
		"\u0000\u0000\u0d62\u0d63\u0005\u0018\u0000\u0000\u0d63\u0d64\u0003\u0138"+
		"\u009c\u0000\u0d64\u0d65\u0005\u000e\u0000\u0000\u0d65\u0d66\u0003\u0138"+
		"\u009c\u0000\u0d66\u0d68\u0001\u0000\u0000\u0000\u0d67\u0d57\u0001\u0000"+
		"\u0000\u0000\u0d67\u0d59\u0001\u0000\u0000\u0000\u0d67\u0d5b\u0001\u0000"+
		"\u0000\u0000\u0d67\u0d61\u0001\u0000\u0000\u0000\u0d68\u0137\u0001\u0000"+
		"\u0000\u0000\u0d69\u0d6a\u0005\u011a\u0000\u0000\u0d6a\u0d71\u00074\u0000"+
		"\u0000\u0d6b\u0d6c\u00058\u0000\u0000\u0d6c\u0d71\u0005\u00e3\u0000\u0000"+
		"\u0d6d\u0d6e\u0003\u00ecv\u0000\u0d6e\u0d6f\u00074\u0000\u0000\u0d6f\u0d71"+
		"\u0001\u0000\u0000\u0000\u0d70\u0d69\u0001\u0000\u0000\u0000\u0d70\u0d6b"+
		"\u0001\u0000\u0000\u0000\u0d70\u0d6d\u0001\u0000\u0000\u0000\u0d71\u0139"+
		"\u0001\u0000\u0000\u0000\u0d72\u0d77\u0003\u013e\u009f\u0000\u0d73\u0d74"+
		"\u0005\u0004\u0000\u0000\u0d74\u0d76\u0003\u013e\u009f\u0000\u0d75\u0d73"+
		"\u0001\u0000\u0000\u0000\u0d76\u0d79\u0001\u0000\u0000\u0000\u0d77\u0d75"+
		"\u0001\u0000\u0000\u0000\u0d77\u0d78\u0001\u0000\u0000\u0000\u0d78\u013b"+
		"\u0001\u0000\u0000\u0000\u0d79\u0d77\u0001\u0000\u0000\u0000\u0d7a\u0d7f"+
		"\u0003\u013e\u009f\u0000\u0d7b\u0d7f\u0005c\u0000\u0000\u0d7c\u0d7f\u0005"+
		"\u008d\u0000\u0000\u0d7d\u0d7f\u0005\u00dd\u0000\u0000\u0d7e\u0d7a\u0001"+
		"\u0000\u0000\u0000\u0d7e\u0d7b\u0001\u0000\u0000\u0000\u0d7e\u0d7c\u0001"+
		"\u0000\u0000\u0000\u0d7e\u0d7d\u0001\u0000\u0000\u0000\u0d7f\u013d\u0001"+
		"\u0000\u0000\u0000\u0d80\u0d85\u0003\u0144\u00a2\u0000\u0d81\u0d82\u0005"+
		"\u0005\u0000\u0000\u0d82\u0d84\u0003\u0144\u00a2\u0000\u0d83\u0d81\u0001"+
		"\u0000\u0000\u0000\u0d84\u0d87\u0001\u0000\u0000\u0000\u0d85\u0d83\u0001"+
		"\u0000\u0000\u0000\u0d85\u0d86\u0001\u0000\u0000\u0000\u0d86\u013f\u0001"+
		"\u0000\u0000\u0000\u0d87\u0d85\u0001\u0000\u0000\u0000\u0d88\u0d89\u0003"+
		"\u0144\u00a2\u0000\u0d89\u0d8a\u0003\u0142\u00a1\u0000\u0d8a\u0141\u0001"+
		"\u0000\u0000\u0000\u0d8b\u0d8c\u0005\u013d\u0000\u0000\u0d8c\u0d8e\u0003"+
		"\u0144\u00a2\u0000\u0d8d\u0d8b\u0001\u0000\u0000\u0000\u0d8e\u0d8f\u0001"+
		"\u0000\u0000\u0000\u0d8f\u0d8d\u0001\u0000\u0000\u0000\u0d8f\u0d90\u0001"+
		"\u0000\u0000\u0000\u0d90\u0d93\u0001\u0000\u0000\u0000\u0d91\u0d93\u0001"+
		"\u0000\u0000\u0000\u0d92\u0d8d\u0001\u0000\u0000\u0000\u0d92\u0d91\u0001"+
		"\u0000\u0000\u0000\u0d93\u0143\u0001\u0000\u0000\u0000\u0d94\u0d98\u0003"+
		"\u0146\u00a3\u0000\u0d95\u0d96\u0004\u00a2\u0010\u0000\u0d96\u0d98\u0003"+
		"\u0158\u00ac\u0000\u0d97\u0d94\u0001\u0000\u0000\u0000\u0d97\u0d95\u0001"+
		"\u0000\u0000\u0000\u0d98\u0145\u0001\u0000\u0000\u0000\u0d99\u0da0\u0005"+
		"\u0155\u0000\u0000\u0d9a\u0da0\u0003\u0148\u00a4\u0000\u0d9b\u0d9c\u0004"+
		"\u00a3\u0011\u0000\u0d9c\u0da0\u0003\u0156\u00ab\u0000\u0d9d\u0d9e\u0004"+
		"\u00a3\u0012\u0000\u0d9e\u0da0\u0003\u015a\u00ad\u0000\u0d9f\u0d99\u0001"+
		"\u0000\u0000\u0000\u0d9f\u0d9a\u0001\u0000\u0000\u0000\u0d9f\u0d9b\u0001"+
		"\u0000\u0000\u0000\u0d9f\u0d9d\u0001\u0000\u0000\u0000\u0da0\u0147\u0001"+
		"\u0000\u0000\u0000\u0da1\u0da5\u0005\u0156\u0000\u0000\u0da2\u0da3\u0004"+
		"\u00a4\u0013\u0000\u0da3\u0da5\u0005\u014b\u0000\u0000\u0da4\u0da1\u0001"+
		"\u0000\u0000\u0000\u0da4\u0da2\u0001\u0000\u0000\u0000\u0da5\u0149\u0001"+
		"\u0000\u0000\u0000\u0da6\u0da7\u0005\u0156\u0000\u0000\u0da7\u014b\u0001"+
		"\u0000\u0000\u0000\u0da8\u0daa\u0004\u00a6\u0014\u0000\u0da9\u0dab\u0005"+
		"\u013d\u0000\u0000\u0daa\u0da9\u0001\u0000\u0000\u0000\u0daa\u0dab\u0001"+
		"\u0000\u0000\u0000\u0dab\u0dac\u0001\u0000\u0000\u0000\u0dac\u0dd4\u0005"+
		"\u0150\u0000\u0000\u0dad\u0daf\u0004\u00a6\u0015\u0000\u0dae\u0db0\u0005"+
		"\u013d\u0000\u0000\u0daf\u0dae\u0001\u0000\u0000\u0000\u0daf\u0db0\u0001"+
		"\u0000\u0000\u0000\u0db0\u0db1\u0001\u0000\u0000\u0000\u0db1\u0dd4\u0005"+
		"\u0151\u0000\u0000\u0db2\u0db4\u0004\u00a6\u0016\u0000\u0db3\u0db5\u0005"+
		"\u013d\u0000\u0000\u0db4\u0db3\u0001\u0000\u0000\u0000\u0db4\u0db5\u0001"+
		"\u0000\u0000\u0000\u0db5\u0db6\u0001\u0000\u0000\u0000\u0db6\u0dd4\u0007"+
		"5\u0000\u0000\u0db7\u0db9\u0005\u013d\u0000\u0000\u0db8\u0db7\u0001\u0000"+
		"\u0000\u0000\u0db8\u0db9\u0001\u0000\u0000\u0000\u0db9\u0dba\u0001\u0000"+
		"\u0000\u0000\u0dba\u0dd4\u0005\u014f\u0000\u0000\u0dbb\u0dbd\u0005\u013d"+
		"\u0000\u0000\u0dbc\u0dbb\u0001\u0000\u0000\u0000\u0dbc\u0dbd\u0001\u0000"+
		"\u0000\u0000\u0dbd\u0dbe\u0001\u0000\u0000\u0000\u0dbe\u0dd4\u0005\u014c"+
		"\u0000\u0000\u0dbf\u0dc1\u0005\u013d\u0000\u0000\u0dc0\u0dbf\u0001\u0000"+
		"\u0000\u0000\u0dc0\u0dc1\u0001\u0000\u0000\u0000\u0dc1\u0dc2\u0001\u0000"+
		"\u0000\u0000\u0dc2\u0dd4\u0005\u014d\u0000\u0000\u0dc3\u0dc5\u0005\u013d"+
		"\u0000\u0000\u0dc4\u0dc3\u0001\u0000\u0000\u0000\u0dc4\u0dc5\u0001\u0000"+
		"\u0000\u0000\u0dc5\u0dc6\u0001\u0000\u0000\u0000\u0dc6\u0dd4\u0005\u014e"+
		"\u0000\u0000\u0dc7\u0dc9\u0005\u013d\u0000\u0000\u0dc8\u0dc7\u0001\u0000"+
		"\u0000\u0000\u0dc8\u0dc9\u0001\u0000\u0000\u0000\u0dc9\u0dca\u0001\u0000"+
		"\u0000\u0000\u0dca\u0dd4\u0005\u0153\u0000\u0000\u0dcb\u0dcd\u0005\u013d"+
		"\u0000\u0000\u0dcc\u0dcb\u0001\u0000\u0000\u0000\u0dcc\u0dcd\u0001\u0000"+
		"\u0000\u0000\u0dcd\u0dce\u0001\u0000\u0000\u0000\u0dce\u0dd4\u0005\u0152"+
		"\u0000\u0000\u0dcf\u0dd1\u0005\u013d\u0000\u0000\u0dd0\u0dcf\u0001\u0000"+
		"\u0000\u0000\u0dd0\u0dd1\u0001\u0000\u0000\u0000\u0dd1\u0dd2\u0001\u0000"+
		"\u0000\u0000\u0dd2\u0dd4\u0005\u0154\u0000\u0000\u0dd3\u0da8\u0001\u0000"+
		"\u0000\u0000\u0dd3\u0dad\u0001\u0000\u0000\u0000\u0dd3\u0db2\u0001\u0000"+
		"\u0000\u0000\u0dd3\u0db8\u0001\u0000\u0000\u0000\u0dd3\u0dbc\u0001\u0000"+
		"\u0000\u0000\u0dd3\u0dc0\u0001\u0000\u0000\u0000\u0dd3\u0dc4\u0001\u0000"+
		"\u0000\u0000\u0dd3\u0dc8\u0001\u0000\u0000\u0000\u0dd3\u0dcc\u0001\u0000"+
		"\u0000\u0000\u0dd3\u0dd0\u0001\u0000\u0000\u0000\u0dd4\u014d\u0001\u0000"+
		"\u0000\u0000\u0dd5\u0dd6\u0005\u0118\u0000\u0000\u0dd6\u0de1\u0003\u0116"+
		"\u008b\u0000\u0dd7\u0de1\u0003\"\u0011\u0000\u0dd8\u0de1\u0003\u0114\u008a"+
		"\u0000\u0dd9\u0dda\u00076\u0000\u0000\u0dda\u0ddb\u0005\u00ac\u0000\u0000"+
		"\u0ddb\u0de1\u0005\u00ad\u0000\u0000\u0ddc\u0ddd\u0005\u00ef\u0000\u0000"+
		"\u0ddd\u0de1\u0003\u011c\u008e\u0000\u0dde\u0ddf\u0005R\u0000\u0000\u0ddf"+
		"\u0de1\u0005F\u0000\u0000\u0de0\u0dd5\u0001\u0000\u0000\u0000\u0de0\u0dd7"+
		"\u0001\u0000\u0000\u0000\u0de0\u0dd8\u0001\u0000\u0000\u0000\u0de0\u0dd9"+
		"\u0001\u0000\u0000\u0000\u0de0\u0ddc\u0001\u0000\u0000\u0000\u0de0\u0dde"+
		"\u0001\u0000\u0000\u0000\u0de1\u014f\u0001\u0000\u0000\u0000\u0de2\u0de6"+
		"\u0005\u014a\u0000\u0000\u0de3\u0de4\u0004\u00a8\u0017\u0000\u0de4\u0de6"+
		"\u0005\u014b\u0000\u0000\u0de5\u0de2\u0001\u0000\u0000\u0000\u0de5\u0de3"+
		"\u0001\u0000\u0000\u0000\u0de6\u0151\u0001\u0000\u0000\u0000\u0de7\u0dea"+
		"\u0003\u0150\u00a8\u0000\u0de8\u0dea\u0005\u00ad\u0000\u0000\u0de9\u0de7"+
		"\u0001\u0000\u0000\u0000\u0de9\u0de8\u0001\u0000\u0000\u0000\u0dea\u0153"+
		"\u0001\u0000\u0000\u0000\u0deb\u0dee\u0005\u014f\u0000\u0000\u0dec\u0dee"+
		"\u0003\u0150\u00a8\u0000\u0ded\u0deb\u0001\u0000\u0000\u0000\u0ded\u0dec"+
		"\u0001\u0000\u0000\u0000\u0dee\u0155\u0001\u0000\u0000\u0000\u0def\u0df0"+
		"\u00077\u0000\u0000\u0df0\u0157\u0001\u0000\u0000\u0000\u0df1\u0df2\u0007"+
		"8\u0000\u0000\u0df2\u0159\u0001\u0000\u0000\u0000\u0df3\u0df4\u00079\u0000"+
		"\u0000\u0df4\u015b\u0001\u0000\u0000\u0000\u01d3\u0160\u0179\u0186\u018d"+
		"\u0195\u0197\u01ab\u01af\u01b5\u01b8\u01bb\u01c2\u01c5\u01c9\u01cc\u01d3"+
		"\u01de\u01e0\u01e8\u01eb\u01ef\u01f2\u01f8\u0203\u0209\u020e\u0230\u023d"+
		"\u0256\u025f\u0263\u0269\u026d\u0272\u0278\u0284\u028c\u0292\u029f\u02a4"+
		"\u02b4\u02bb\u02bf\u02c5\u02d4\u02d8\u02de\u02e4\u02e7\u02ea\u02f0\u02f4"+
		"\u02fc\u02fe\u0307\u030a\u0313\u0318\u031e\u0325\u0328\u032e\u0339\u033c"+
		"\u0340\u0345\u034a\u0351\u0354\u0357\u035e\u0363\u036c\u0374\u037a\u037d"+
		"\u0380\u0386\u038a\u038f\u0392\u0396\u0398\u03a0\u03a8\u03ab\u03b0\u03b6"+
		"\u03bc\u03bf\u03c3\u03c6\u03ca\u03e6\u03e9\u03ed\u03f3\u03f6\u03f9\u03ff"+
		"\u0407\u040c\u0412\u0418\u041b\u0422\u0429\u0431\u0442\u0450\u0453\u0459"+
		"\u0462\u046b\u0473\u0478\u047d\u0484\u048a\u048f\u0497\u049a\u049e\u04aa"+
		"\u04ae\u04b5\u0529\u0531\u0539\u0542\u054c\u0550\u0553\u0559\u055f\u056b"+
		"\u0577\u057c\u0585\u058d\u0594\u0596\u0599\u059e\u05a2\u05a7\u05aa\u05af"+
		"\u05b8\u05bd\u05c0\u05c5\u05c9\u05ce\u05d0\u05d4\u05dd\u05e5\u05eb\u05f6"+
		"\u05fd\u0606\u060b\u060e\u0624\u0626\u062f\u0636\u0639\u0640\u0644\u064a"+
		"\u0652\u065d\u0668\u0670\u0676\u0682\u0689\u0690\u069c\u06a4\u06aa\u06b0"+
		"\u06b3\u06bc\u06bf\u06c8\u06cb\u06d4\u06d7\u06e0\u06e3\u06e6\u06eb\u06ed"+
		"\u06f1\u06fd\u0704\u070b\u070e\u0710\u071c\u0720\u0724\u072a\u072e\u0736"+
		"\u073a\u073d\u0740\u0743\u0747\u074b\u0750\u0754\u0757\u075a\u075d\u0761"+
		"\u0766\u076a\u076d\u0770\u0773\u0775\u077b\u0782\u0787\u078a\u078d\u0791"+
		"\u079b\u079f\u07a1\u07a4\u07a8\u07ae\u07b2\u07bd\u07c7\u07cb\u07d7\u07e3"+
		"\u07f2\u07f7\u07fd\u0804\u0814\u0819\u0826\u082b\u0833\u0839\u083d\u0840"+
		"\u0843\u084a\u0850\u0859\u0863\u0872\u0877\u0879\u087d\u0886\u0893\u0898"+
		"\u089c\u08a4\u08a7\u08ab\u08b9\u08c6\u08cb\u08cf\u08d2\u08d6\u08dc\u08df"+
		"\u08e6\u08f2\u08fd\u090a\u0915\u091a\u0922\u0927\u092e\u0937\u093a\u093f"+
		"\u0946\u0949\u094e\u0954\u095a\u095f\u0963\u0969\u096d\u0970\u0975\u0978"+
		"\u097d\u0981\u0984\u0987\u098d\u0992\u0999\u099c\u09ae\u09b0\u09b3\u09be"+
		"\u09c7\u09ce\u09d6\u09dd\u09e1\u09e4\u09ec\u09f4\u09fa\u0a02\u0a0e\u0a11"+
		"\u0a17\u0a1b\u0a1d\u0a26\u0a32\u0a34\u0a3b\u0a42\u0a48\u0a4e\u0a50\u0a57"+
		"\u0a5f\u0a67\u0a6d\u0a72\u0a79\u0a7f\u0a83\u0a85\u0a8c\u0a95\u0a9c\u0aa6"+
		"\u0aab\u0aaf\u0ab8\u0ac5\u0ac7\u0acf\u0ad1\u0ad5\u0add\u0ae6\u0aec\u0af4"+
		"\u0af9\u0b05\u0b0a\u0b0d\u0b13\u0b17\u0b1c\u0b21\u0b26\u0b2c\u0b41\u0b43"+
		"\u0b60\u0b64\u0b6d\u0b71\u0b83\u0b86\u0b8e\u0b97\u0ba0\u0bb7\u0bc2\u0bc9"+
		"\u0bcc\u0bd5\u0bd9\u0bdd\u0be9\u0c02\u0c09\u0c0c\u0c1b\u0c30\u0c34\u0c36"+
		"\u0c40\u0c42\u0c51\u0c53\u0c60\u0c64\u0c6b\u0c70\u0c78\u0c7d\u0c86\u0c97"+
		"\u0c9b\u0ca1\u0ca7\u0cb0\u0cb4\u0cb6\u0cbd\u0cc4\u0cc7\u0cca\u0ccd\u0cd7"+
		"\u0cde\u0ce1\u0ce8\u0cf0\u0cf8\u0d06\u0d0b\u0d10\u0d13\u0d20\u0d34\u0d3e"+
		"\u0d41\u0d4a\u0d4d\u0d4f\u0d52\u0d55\u0d67\u0d70\u0d77\u0d7e\u0d85\u0d8f"+
		"\u0d92\u0d97\u0d9f\u0da4\u0daa\u0daf\u0db4\u0db8\u0dbc\u0dc0\u0dc4\u0dc8"+
		"\u0dcc\u0dd0\u0dd3\u0de0\u0de5\u0de9\u0ded";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}