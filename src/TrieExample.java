public class TrieExample {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");

        // Проверка поиска слов
        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("app"));   // true
        System.out.println(trie.search("appl"));  // false

        // Проверка наличия префикса
        System.out.println(trie.startsWith("app")); // true
        System.out.println(trie.startsWith("apl")); // false
    }

}