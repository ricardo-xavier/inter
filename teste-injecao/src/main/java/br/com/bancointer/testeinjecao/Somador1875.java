package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1875")
public class Somador1875 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
