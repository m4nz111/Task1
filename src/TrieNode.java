public class TrieNode {

    private TrieNode[] children;
    private boolean isEndOfWord;


    public TrieNode() {
        children = new TrieNode[26]; // Для английского алфавита (a-z)
        isEndOfWord = false;
    }

    public TrieNode getChild(char c) {
        return children[c - 'a'];
    }

    public void setChild(char c, TrieNode node) {
        children[c - 'a'] = node;
    }

    public boolean hasChild(char c) {
        return children[c - 'a'] != null;
    }

    public void setEndOfWord(boolean isEndOfWord) {
        this.isEndOfWord = isEndOfWord;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }
}