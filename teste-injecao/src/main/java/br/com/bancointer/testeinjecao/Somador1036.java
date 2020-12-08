package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1036")
public class Somador1036 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
