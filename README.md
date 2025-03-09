# java-code-review

Things to fix in `Main.java`. Based on [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)

## Source file structure

1. There must be [exactly one top level class](https://google.github.io/styleguide/javaguide.html#s3.4.1-one-top-level-class)

## Formatting

2. Use [2-space block indentation](https://google.github.io/styleguide/javaguide.html#s4.2-block-indentation)
3. Multiple blank lines are not encouraged (See the end of the [section](https://google.github.io/styleguide/javaguide.html#s4.6.1-vertical-whitespace)).
4. Use [vertical whitespaces](https://google.github.io/styleguide/javaguide.html#s4.6.1-vertical-whitespace) between class methods (and optionally class fields)

### [Horisontal whitespaces](https://google.github.io/styleguide/javaguide.html#s4.6.2-horizontal-whitespace)

5. Use horizontal whitespaces on both sides of binary operators (e.g. `&`, `>=`)
6. There must be a whitespace between the start of comment `//` and the comment text. The one is missing on lines 4 and 13.
7. There must be a whitespace after `,` on line 8
8. Only one space between keyword and identifier on line 39

## Naming

9. Class names [must be in `UpperCamelCase`](https://google.github.io/styleguide/javaguide.html#s5.2.2-class-names)
10. Non-constant field names [must be in `lowerCamelCase`](https://google.github.io/styleguide/javaguide.html#s5.2.6-parameter-names)
11. Method names [must follow `lowerCamelCase`](https://google.github.io/styleguide/javaguide.html#s5.2.3-method-names)

## Outside of Code Style
12. Use common prefixes for getters and setters: `get*`, `set*` instead of `take*` or `put*`
13. Remove IDE-generated comments (lines 4,5)
14. Use common "BMI" abbreviation instead of "IMB"
15. Use meaningful field names so that the comments describing their purpose could be removed
16. The static method should be called in a static way (`HumanIMB.Result()` instead of `humanIMB.Result()`)
17. Use `&&` instead of `&` to avoid unwanted behaviour
18. The variable assignments could be replaced with `return` statements
19. The `Result` method need a better name (e.g. `getBmiFeedback`)
20. Avoid "magic numbers". Without an IDE (e.g. while reviewing conde on GitHub, the purpose of function arguments is not clear)
21. Holding `imb` in static state can lead to unwanted behaviour
22. Putting BMI calculation (business logic) inside a constructor is not a good practice. A dedicated method should be created
23. What's the purpose of getters/setters if the fields are marked as `public`? You'd better make them `private`
24. Business logic should not live in setters: it's a side effect
