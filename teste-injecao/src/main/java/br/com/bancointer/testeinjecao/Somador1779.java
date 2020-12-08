package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1779")
public class Somador1779 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
