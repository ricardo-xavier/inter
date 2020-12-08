package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador522")
public class Somador522 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
