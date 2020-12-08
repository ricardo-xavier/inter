package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador753")
public class Somador753 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
