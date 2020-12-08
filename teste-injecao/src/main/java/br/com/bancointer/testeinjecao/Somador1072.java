package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1072")
public class Somador1072 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
