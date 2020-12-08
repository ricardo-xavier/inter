package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1114")
public class Somador1114 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
