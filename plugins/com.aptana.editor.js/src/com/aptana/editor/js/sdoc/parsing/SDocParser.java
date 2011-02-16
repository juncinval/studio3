package com.aptana.editor.js.sdoc.parsing;

import java.util.ArrayList;
import java.util.List;
import com.aptana.editor.js.sdoc.model.*;
import beaver.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "SDoc.grammar".
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SDocParser extends Parser {

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pjLbbmL4KKFU$DP192WB1bCSGGOlPCaiaaB8BYGbHKGC8MKHGbAegAkE364XKLt2Zzq2e" +
		"$$D4$jVH7Yr89AYgAg8Yue8Y2Y28I5K44ZTVJFNTUdc766ZwfuasTFkSkVRlVc#v#3t3RC1" +
		"3zaOr#w8j1w8C168mSz4O0cOP5S18AK8wPc8DhS3kMu5xqGYxoKO9IN8hBC1UtuXuyW2hv1" +
		"sa9gfs9SRPY1ghXogifLaijAmTvI4yvzmGyac1#npt7kgVMhh4pCDJo1RH7emaHd8LY3ADr" +
		"ccUFmMISvrcryZTcOIAoS2vNHv6lNwpY39$ThPhHWig44TDdQjB8XKcgNOVJa$QPd22IWp8" +
		"YwDaFSVuFsnsMXKki5RBMKCost8BBiG33SODz6iQp25TP7eBvbk$2RHofqDkfDs8nbkD4py" +
		"x2tHX9TJKMndtIWHKsrem7CGNDiXgJE58pVwsucEtDkDPQTwATUSkOyHhkPwKAr22CEjIZ0" +
		"L4qOWH6uMISYbCmbf5pS3REntXCeAx1D4ndUn7HXYjm9NlFexuUD#4Mt46rbCZ2VMmpf0iE" +
		"N9vQGPv18Pu96Jm5gXcfufCp3F80hfr1zdpBvRcHp$EWWC#Wa7TQnATbdau9JpkNkUK9glN" +
		"bcZEL8gmqdFDEhLfgMQPk#L7b7Zc$uvvZtsFMMBQFC#tkwsFPuRaNjqsVRCzok69THgijQd" +
		"pzOfNw##nk5UPUh4iOYOr#T94mPv2yMYX1nCpK86v7Q4NLM#kp7Dt15UGq$j9j3#DnDH9GD" +
		"dQ8PqfyfwRJTlcBswPkgLMLdYzU8qokqxke89ipojYLjerPiJpNgW1Fi31d4sJ5C4$ae6qR" +
		"B9j8ANMPrUQaCnomQ6J$MEycvWRLMw##2CorifsDY6mdzIFAg8LSIem2d2NjDWqBbPSQJXM" +
		"ybXEF4ayIJxFUOQADIoYJzdF4IzJvH37HGBj3#wqZDjBNoFnbrCE8BR6OioB6RXCnGdKk$H" +
		"p7pTESJkhHgX#dBb2zW7giwjdAJn5JZvoxop4TpjajqRovnBl4VBMV9Lh$syTvWkWY5gdz8" +
		"l6Crfj0lOfOJ6E7tkSUvVsQCudnFUGM6brQ8qJmlt6da5SJ7SHU8iytLxv9t6cgf$lcKwo#" +
		"LkgtYOD4bVfcKgyd#7yxKSqVGpGpDekyYToBF55ZCxhhyWqCTuxg#5Wl42#hBn3FvNBQfd5" +
		"lNgc0LvHzNY6FD$UjDJOgc$lPvS$dEFfCdUSvjzwgvr5dKAJhFMSb7ilDJk8Vc2Z7h3Uj$n" +
		"Zru2Hzyxkriuzs3b6eze7uclJb3p4#inSqvn1raQ$6uTW#SLQflKPvhQz6aVesAE#cJ$zli" +
		"oxTShEUuy$n$y2SpRww1looSRRwV7mNkBNqxLGxPFQhJqVCFepVlwzV9CPOYHwN$2gTyhFi" +
		"bR$aaFmf1#KFEI3xvNVP9xy9xrwuC#GdBtktSgVyoFO7pzh5TejyodQp#ZuHdYMooUgFv4E" +
		"s7nCVM7k3V2wVoHUQoJqYxnFhhVMUl2LhoTpriivwtl56#PxOINpdUNQmtUxDhbE#bJUjUe" +
		"DO8w$JyuqNs#QfhzbkzQolY2$b5oqoZjz#3hy00ugWVOkOzrHr2eWoDshVQUQBrE69x$gGr" +
		"aFtj0s74iHZNCVvrB5clI9i4I22oW7r1NsnD1#dQon4P5ZTm3o39ek0nutaE4R#2$hHoqO=");

	// suppress parser error reporting and let the custom error recovery mechanism handle it
	private static class SDocEvents extends Events
	{
		public void scannerError(Scanner.Exception e)
		{
		}

		public void syntaxError(Symbol token)
		{
		}

		public void unexpectedTokenRemoved(Symbol token)
		{
		}

		public void missingTokenInserted(Symbol token)
		{
		}

		public void misspelledTokenReplaced(Symbol token)
		{
		}

		public void errorPhraseRemoved(Symbol error)
		{
		}
	}

	private SDocScanner fScanner;

	/**
	 * parse
	 *
	 * @param source
	 */
	public Object parse(String source) throws java.lang.Exception
	{
		return parse(source, 0);
	}

	/**
	 * parse
	 *
	 * @param source
	 * @param offset
	 */
	public Object parse(String source, int offset) throws java.lang.Exception
	{
		fScanner.setOffset(offset);
		fScanner.setSource(source);

		return parse(fScanner);
	}

	public SDocParser() {
		super(PARSING_TABLES);


	report = new SDocEvents();
	fScanner = new SDocScanner();
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		switch(rule_num) {
			case 1: // Block = START_DOCUMENTATION Text.text END_DOCUMENTATION
			{
					final Symbol text = _symbols[offset + 2];
					
			return new DocumentationBlock((String) text.value);
			}
			case 2: // Block = START_DOCUMENTATION Tags.tags END_DOCUMENTATION
			{
					final Symbol tags = _symbols[offset + 2];
					
			return new DocumentationBlock((List<Tag>) tags.value);
			}
			case 3: // Block = START_DOCUMENTATION Text.text Tags.tags END_DOCUMENTATION
			{
					final Symbol text = _symbols[offset + 2];
					final Symbol tags = _symbols[offset + 3];
					
			return new DocumentationBlock((String) text.value, (List<Tag>) tags.value);
			}
			case 4: // Text = Text.text TextPart.part
			{
					final Symbol text = _symbols[offset + 1];
					final Symbol part = _symbols[offset + 2];
					
			return new Symbol(text.value + " " + part.value);
			}
			case 15: // Tags = Tags.tags Tag.tag
			{
					final Symbol tags = _symbols[offset + 1];
					final Symbol _symbol_tag = _symbols[offset + 2];
					final Tag tag = (Tag) _symbol_tag.value;
					
			((List<Tag>) tags.value).add(tag);

			return tags;
			}
			case 16: // Tags = Tag.tag
			{
					final Symbol _symbol_tag = _symbols[offset + 1];
					final Tag tag = (Tag) _symbol_tag.value;
					
			List<Tag> tags = new ArrayList<Tag>();

			tags.add(tag);

			return new Symbol(tags);
			}
			case 19: // Tag = ADVANCED opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AdvancedTag((String) text.value);
			}
			case 20: // Tag = ALIAS Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AliasTag((String) text.value);
			}
			case 21: // Tag = AUTHOR Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AuthorTag((String) text.value);
			}
			case 22: // Tag = CLASS_DESCRIPTION LCURLY Namespace.name RCURLY Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 3];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 5];
					
			return new ClassDescriptionTag(name, (String) text.value);
			}
			case 23: // Tag = CONSTRUCTOR opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new ConstructorTag((String) text.value);
			}
			case 24: // Tag = EXAMPLE Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new ExampleTag((String) text.value);
			}
			case 25: // Tag = EXCEPTION LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ExceptionTag((List<Type>) types.value, (String) text.value);
			}
			case 26: // Tag = EXTENDS LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ExtendsTag((List<Type>) types.value, (String) text.value);
			}
			case 27: // Tag = INTERNAL opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new InternalTag((String) text.value);
			}
			case 28: // Tag = METHOD opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new MethodTag((String) text.value);
			}
			case 29: // Tag = NAMESPACE LCURLY Namespace.name RCURLY opt$Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 3];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 5];
					
			return new NamespaceTag(name, (String) text.value);
			}
			case 30: // Tag = OVERVIEW Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new OverviewTag((String) text.value);
			}
			case 31: // Tag = PARAM LCURLY Types.types RCURLY ParamName.name opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol _symbol_name = _symbols[offset + 5];
					final Parameter name = (Parameter) _symbol_name.value;
					final Symbol text = _symbols[offset + 6];
					
			return new ParamTag(name, (List<Type>) types.value, (String) text.value);
			}
			case 32: // Tag = PRIVATE opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new PrivateTag((String) text.value);
			}
			case 33: // Tag = PROPERTY LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new PropertyTag((List<Type>) types.value, (String) text.value);
			}
			case 34: // Tag = RETURN LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ReturnTag((List<Type>) types.value, (String) text.value);
			}
			case 35: // Tag = SEE Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new SeeTag((String) text.value);
			}
			case 36: // Tag = TYPE LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new TypeTag((List<Type>) types.value, (String) text.value);
			}
			case 37: // Tag = UNKNOWN.name opt$Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 2];
					
			return new UnknownTag(name, (String) text.value);
			}
			case 38: // Types = Types.types TypeDelimiter Type.type
			{
					final Symbol types = _symbols[offset + 1];
					final Symbol _symbol_type = _symbols[offset + 3];
					final Type type = (Type) _symbol_type.value;
					
			((List<Type>) types.value).add(type);

			return types;
			}
			case 39: // Types = Type.type
			{
					final Symbol _symbol_type = _symbols[offset + 1];
					final Type type = (Type) _symbol_type.value;
					
			List<Type> types = new ArrayList<Type>();

			types.add(type);

			return new Symbol(types);
			}
			case 42: // Type = IDENTIFIER.name
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new Type(name);
			}
			case 43: // Type = IDENTIFIER.name LBRACKET RBRACKET
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new ArrayType(new Type(name));
			}
			case 44: // Type = CLASS LESS_THAN Type.memberType GREATER_THAN
			{
					final Symbol _symbol_memberType = _symbols[offset + 3];
					final Type memberType = (Type) _symbol_memberType.value;
					
			return new ClassType(memberType);
			}
			case 45: // Type = ARRAY LBRACKET RBRACKET
			{
					
			return new ArrayType();
			}
			case 46: // Type = FUNCTION LBRACKET RBRACKET
			{
					
			return new FunctionType();
			}
			case 47: // Type = ARRAY
			{
					
			return new ArrayType();
			}
			case 48: // Type = ARRAY LESS_THAN Type.memberType GREATER_THAN
			{
					final Symbol _symbol_memberType = _symbols[offset + 3];
					final Type memberType = (Type) _symbol_memberType.value;
					
			return new ArrayType(memberType);
			}
			case 49: // Type = FUNCTION
			{
					
			return new FunctionType();
			}
			case 50: // Type = FUNCTION ReturnDelimiter Type.returnType
			{
					final Symbol _symbol_returnType = _symbols[offset + 3];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();

			function.addReturnType(returnType);

			return function;
			}
			case 51: // Type = FUNCTION ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol returnTypes = _symbols[offset + 4];
					
			FunctionType function = new FunctionType();

			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}

			return function;
			}
			case 52: // Type = FUNCTION LPAREN RPAREN
			{
					
			return new FunctionType();
			}
			case 53: // Type = FUNCTION LPAREN RPAREN ReturnDelimiter Type.returnType
			{
					final Symbol _symbol_returnType = _symbols[offset + 5];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();

			function.addReturnType(returnType);

			return function;
			}
			case 54: // Type = FUNCTION LPAREN RPAREN ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol returnTypes = _symbols[offset + 6];
					
			FunctionType function = new FunctionType();

			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}

			return function;
			}
			case 55: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					
			FunctionType function = new FunctionType();

			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}

			return function;
			}
			case 56: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN ReturnDelimiter Type.returnType
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					final Symbol _symbol_returnType = _symbols[offset + 6];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();

			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}

			function.addReturnType(returnType);

			return function;
			}
			case 57: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					final Symbol returnTypes = _symbols[offset + 7];
					
			FunctionType function = new FunctionType();

			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}

			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}

			return function;
			}
			case 58: // Type = PROPERTIES LESS_THAN Type.memberType GREATER_THAN
			{
					final Symbol _symbol_memberType = _symbols[offset + 3];
					final Type memberType = (Type) _symbol_memberType.value;
					
			return new PropertiesType(memberType);
			}
			case 61: // ParamName = TEXT.name
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new Parameter(name);
			}
			case 62: // ParamName = LBRACKET TEXT.name RBRACKET
			{
					final Symbol _symbol_name = _symbols[offset + 2];
					final String name = (String) _symbol_name.value;
					
			Parameter result = new Parameter(name);

			result.setUsage(Usage.OPTIONAL);

			return result;
			}
			case 63: // ParamName = ELLIPSIS
			{
					
			Parameter result = new Parameter("...");

			result.setUsage(Usage.ONE_OR_MORE);

			return result;
			}
			case 64: // ParamName = LBRACKET ELLIPSIS RBRACKET
			{
					
			Parameter result = new Parameter("...");

			result.setUsage(Usage.ZERO_OR_MORE);

			return result;
			}
			case 17: // opt$Text = 
			{
				return new Symbol(null);
			}
			case 0: // Grammar = Block
			case 5: // Text = TextPart
			case 6: // TextPart = TEXT
			case 7: // TextPart = LBRACKET
			case 8: // TextPart = RBRACKET
			case 9: // TextPart = LCURLY
			case 10: // TextPart = RCURLY
			case 11: // TextPart = POUND
			case 12: // TextPart = IDENTIFIER
			case 13: // TextPart = COLON
			case 14: // TextPart = ERROR
			case 18: // opt$Text = Text
			case 40: // TypeDelimiter = COMMA
			case 41: // TypeDelimiter = PIPE
			case 59: // ReturnDelimiter = COLON
			case 60: // ReturnDelimiter = ARROW
			case 65: // Namespace = IDENTIFIER
			case 66: // Namespace = FUNCTION
			case 67: // Namespace = ARRAY
			{
				return _symbols[offset + 1];
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}
