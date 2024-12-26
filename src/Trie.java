public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Метод для добавления слова
    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.hasChild(c)) {
                current.setChild(c, new TrieNode());
            }
            current = current.getChild(c);
        }
        current.setEndOfWord(true);
    }

    // Метод для поиска слова
    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.hasChild(c)) {
                return false;
            }
            current = current.getChild(c);
        }
        return current.isEndOfWord();
    }

    // Метод для проверки, начинается ли слово с префикса
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            if (!current.hasChild(c)) {
                return false;
            }
            current = current.getChild(c);
        }
        return true;
    }
}