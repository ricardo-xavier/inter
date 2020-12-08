package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1149")
public class Somador1149 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
