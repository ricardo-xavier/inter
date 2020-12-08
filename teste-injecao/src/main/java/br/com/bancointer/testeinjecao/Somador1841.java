package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1841")
public class Somador1841 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
