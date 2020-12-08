package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador963")
public class Somador963 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
