package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador920")
public class Somador920 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
