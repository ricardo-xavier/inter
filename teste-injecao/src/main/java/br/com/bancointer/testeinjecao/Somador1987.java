package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1987")
public class Somador1987 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
