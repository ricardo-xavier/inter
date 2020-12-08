package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador216")
public class Somador216 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
