package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1048")
public class Somador1048 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
