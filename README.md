<h1>Hash Attack</h1>
Hash attack. Find 2^N strings, each of length N, that have the same hashCode() value, supposing the hashCode() implementation for String (as specified in the Java standard) is the following:
```
public int hashCode() {
  int hash = 0;
  for (int i = 0; i < length(); i++)
  hash = (hash * 31) + charAt(i);
  return hash;
}
```
