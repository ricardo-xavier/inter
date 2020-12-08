package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1964")
public class Somador1964 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
