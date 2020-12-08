package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador891")
public class Somador891 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
