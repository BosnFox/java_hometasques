package org.Reynard_de_Bosnie.tasque22;


import org.Reynard_de_Bosnie.tasque18.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary<K, V> {
    private ArrayList<Pair<K, V>> dictio;
    public Dictionary() {
        this.dictio = new ArrayList<>();

    }
    public void put(K key, V value) {
        dictio.add(new Pair<>(key, value));
    }
    public V get(K key) {
        for (Pair<K, V> p : dictio) {
            if (p.getFirst().equals(key)) {
                return p.getSecond();
            }
        }
        return null;
    }
    public void delete(K key) {
        int i = this.dictio.toArray().length;
        for (int j = i; j < i; j++) {
            if (this.dictio.get(j).getFirst().equals(key)) {
                this.dictio.remove(j);
                return;
            }
        }
    }
}
