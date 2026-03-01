# Java Core and Algorithms

Structured practice in Java core and algorithms. Includes implementations of
data structures, algorithmic challenges, and performance analysis with a focus
on clean, maintainable code.

## Code Style and Linting

This project includes formatter and linter setup via Maven:

- Spotless with `google-java-format` for automatic formatting
- Checkstyle for lightweight style checks (`NeedBraces`, `UnusedImports`,
  and consecutive blank lines)

### Commands

- `mvn spotless:apply` - auto-format Java files in `src`
- `mvn spotless:check` - verify formatting
- `mvn checkstyle:check` - run lint checks
- `mvn verify` - run both formatter check and lint in one command
