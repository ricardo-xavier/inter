package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1216")
public class Somador1216 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
